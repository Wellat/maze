/**
 * Created by Vanguard on 2016/12/14.
 */
var mychart = null;

var option3 = {
    title: {
        text: '漏斗图',
        subtext: '纯属虚构',
        left: 'left',
        top: 'bottom'
    },
    tooltip: {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c}%"
    },
    toolbox: {
        orient: 'vertical',
        top: 'center',
        feature: {
            dataView: {readOnly: false},
            restore: {},
            saveAsImage: {}
        }
    },
    legend: {
        orient: 'vertical',
        left: 'left',
        data: []
    },
    calculable: true,
    series: [
        {
            name: '漏斗图1',
            type: 'funnel',
            width: '40%',
            height: '45%',
            left: '5%',
            top: '50%',
            data:[
            ]
        },
        {
            name: '金字塔1',
            type: 'funnel',
            width: '40%',
            height: '45%',
            left: '5%',
            top: '5%',
            sort: 'ascending',
            data:[
            ]
        },
        {
            name: '漏斗图',
            type:'funnel',
            width: '40%',
            height: '45%',
            left: '55%',
            top: '5%',
            label: {
                normal: {
                    position: 'left'
                }
            },
            data:[
            ]
        },
        {
            name: '金字塔',
            type:'funnel',
            width: '40%',
            height: '45%',
            left: '55%',
            top: '50%',
            sort: 'ascending',
            label: {
                normal: {
                    position: 'left'
                }
            },
            data:[
            ]
        }
    ]
};

//载入数据
function loadChartData() {
    $.getJSON('/maze/rest/view/funnel.html', function (data) {
        //alert(data);
        if (data.success3) {
            mychart.showLoading({text: '正在努力的读取数据中...'});
            mychart.setOption({
                legend:{data:data.legendJson},
                series:[
                    {name: '漏斗图1',data:data.seriesJson},
                    {name: '金字塔1',data:data.seriesJson},
                    {name: '漏斗图',data:data.seriesJson},
                    {name: '金字塔',data:data.seriesJson}
                ]
            });
            mychart.hideLoading();
        }else {
            alert('提示', data.msg);
        }
    });
}

//载入图表
$(function () {
    mychart = echarts.init(document.getElementById('showFunnelChart'));
    mychart.setOption(option3);
    loadChartData();

});





