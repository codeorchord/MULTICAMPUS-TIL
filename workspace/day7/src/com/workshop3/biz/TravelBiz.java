package com.workshop3.biz;

import com.workshop3.entity.Travel;

public class TravelBiz {
	private Travel[] travels;
	
	public TravelBiz() {
		travels = new Travel[5];
		
		travels[0] = new Travel("TRV001", "뮌헨", "독일항공", Travel.INDIVIDUAL, 10);
		travels[1] = new Travel("TRV002", "프라하", "에어프랑스", Travel.INDIVIDUAL, 7);
		travels[2] = new Travel("TRV003", "엘레이", "델타항공", Travel.PACKAGE, 12);
		travels[3] = new Travel("TRV004", "후쿠오카", "대한항공", Travel.INDIVIDUAL, 15);
		travels[4] = new Travel("TRV005", "상해", "남방항공", Travel.PACKAGE, 10);
	}
	
	public void printAllTravels() {
		for( Travel travel : travels) {
			travel.printTravelInfo();
		}
		System.out.println("-----------------------------------------------------------------------------------");
	}
	
	public void printIndividualTravels() {
		for( Travel travel : travels) {
			if(travel.getTravelType() == Travel.INDIVIDUAL)
				travel.printTravelInfo();
		}
		System.out.println("-----------------------------------------------------------------------------------");
	}
	
	public void printPackageTravels() {
		for( Travel travel : travels) {
			if(travel.getTravelType() == Travel.PACKAGE)
				travel.printTravelInfo();
		}
		System.out.println("-----------------------------------------------------------------------------------");
	}
	
	public Travel reserveTravel(String travelCode, int reserveCount) {
		Travel travel = null;
		for(Travel t : travels) {
			if(t.getTravelCode().equals(travelCode)) {
				travel = t;
				break;
			}
		}
		
		if(travel == null) {
			System.out.println("해당여행코드가 없습니다.");
			return null;
		}
		
		int remain = travel.getMaxPeople() - travel.getReserved();
		if( remain < reserveCount ) {
			System.out.printf("예약 가능 인원이 초과되었습니다. (예약 가능 인원: %d명)\n", remain);
			return null;
		}
		else {
			travel.setReserved(travel.getReserved() + reserveCount);
			return travel;
		}
	}
	
	public void printTravelListTitle() {
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.printf("%-16s%-16s%-17s%-17s%-10s%-10s\n", "여행코드", "도시명", "항공편", "여행유형", "최대예약가능인원", "예약");
		System.out.println("-----------------------------------------------------------------------------------");
	}
}
