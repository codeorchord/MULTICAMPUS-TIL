/**
 * 
 */

window.addEventListener("load", function(){
	
	var dataSet = [];
	
	//1. 데이터 준비
	d3.text("data.txt").then(function(plainText){
		
		var data = plainText.split("\n\r");
		var sales = data[0].split("/");
		
		for(var i = 1; i < sales.length; i++){
			dataSet.push(sales[i]);
		}
	
		d3.select("#myGraph")
		.selectAll("rect")
		.data(dataSet) //데이터 설정
		.enter()
		.append("rect")
		.attr("class", "bar")
		.attr("x", 0)
		.attr("y", function(d, i){
			return i * 30;
		})
		.attr("height", "20px")
		.attr("width", function(d, i){
			return d + "px";
		});
		
		d3.select("#myGraph")
		.selectAll("rect")
		.on("click", function(){
			d3.select(this)
				.style("fill", "cyan");
		});

		var scale = d3.scaleLinear()
		.domain([0, 300])
		.range([0, 300])
		
		var axis = d3.axisBottom(scale);
		
		d3.select("#myGraph")
		.append("g")
		.attr("class", "axis")
		.attr("transform", "translate(0, " + ((1+dataSet.length) * 30+5) + ")" )
		.call(axis);
		
		

	}); //csv.then() end
	
});
			
	



