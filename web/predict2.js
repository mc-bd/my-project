var clothing = 100;
var soju = 100;
var nonrecurring = 100;

var totalspend = 0; // 등급

if (clothing < 158900) {
	if (clothing < 83420) {
		if (soju < 20000) {
			totalspend=7;
			console.log("총소비<1014000, 소비등급 7");
		} else {
			totalspend=7;
			console.log("총소비<1541000, 소비등급6");
		}
	} else {
		if (clothing < 124400) {
			totalspend=7;
			console.log("총소비<2204000 소비등급 5");
		} else {
			totalspend=7;
			console.log("총소비<2823000, 소비등급 4");
		}
	}
} else {
	if (nonrecurring < 259000) {
		if (clothing < 196900) {
			totalspend=7;
			console.log("총소비 <3451000, 소비등급 3");
		} else {
			totalspend=7;
			console.log("총소비 <4061000 , 소비등급 2");
		}
	} else {
		totalspend=7;
		console.log("총소비>5384000, 소비등급 1");
	}
}