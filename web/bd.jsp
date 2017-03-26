<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script  src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<style>

Highcharts.chart('container', {
    title: {
        text: 'Combination chart'
    },
    xAxis: {
        categories: ['ordinary', 'food', 'disposable', 'transportation', 'education']
    },
    labels: {
        items: [{
            html: 'Total fruit consumption',
            style: {
                left: '50px',
                top: '18px',
                color: (Highcharts.theme && Highcharts.theme.textColor) || 'black'
            }
        }]
    },
    series: [{
        type: 'column',
        name: '100',
        data: [700000, 200000, 130000, 60000, 10000]
    }, {
        type: 'column',
        name: '200',
        data: [700000, 200000, 130000, 60000, 10000]
    }, {
        type: 'column',
        name: '300',
        data: [700000, 200000, 130000, 60000, 10000]
    }, {
        type: 'column',
        name: '300',
        data: [700000, 200000, 130000, 60000, 10000]
    }, {
        type: 'column',
        name: '300',
        data: [700000, 200000, 130000, 60000, 10000]
    }, {
        type: 'column',
        name: '300',
        data: [700000, 200000, 130000, 60000, 10000]
    }, {
        type: 'column',
        name: '300',
        data: [700000, 200000, 130000, 60000, 10000]
    }, {
        type: 'column',
        name: '300',
        data: [700000, 200000, 130000, 60000, 10000]
    }, {
        type: 'spline',
        name: '400',
        data: [700000, 200000, 130000, 60000, 10000],
        marker: {
            lineWidth: 2,
            lineColor: Highcharts.getOptions().colors[3],
            fillColor: 'white'
        }
    }, {
        type: 'pie',
        name: 'Total consumption',
        data: [{
            name: 'Jane',
            y: 13,
            color: Highcharts.getOptions().colors[0] // Jane's color
        }, {
            name: 'John',
            y: 23,
            color: Highcharts.getOptions().colors[1] // John's color
        }, {
            name: 'John',
            y: 23,
            color: Highcharts.getOptions().colors[1] // John's color
        }, {
            name: 'John',
            y: 23,
            color: Highcharts.getOptions().colors[1] // John's color
        }, {
            name: 'John',
            y: 23,
            color: Highcharts.getOptions().colors[1] // John's color
        }, {
            name: 'Joe',
            y: 19,
            color: Highcharts.getOptions().colors[2] // Joe's color
        }],
        center: [100, 80],
        size: 60,
        showInLegend: false,
        dataLabels: {
            enabled: false
        }
    }]
});

</style>
<script></script>
</head>
<body>

</body>
</html>