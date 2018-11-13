layui.use('table', function () {
    var table = layui.table;
    //最新活动数据表
    table.render({
        elem: '#new_event'
        , url: '../../data/getUIData'
        , toolbar: '#toolbarDemo'
        , title: '数据表'
        , cellMinWidth: 180
        , height: 'full-200'
        , page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
            layout: ['limit', 'prev', 'page', 'next', 'skip', 'count'] //自定义分页布局
            //,curr: 5 //设定初始在第 5 页
            , groups: 5 //只显示 1 个连续页码
            , first: false //不显示首页
            , last: false //不显示尾页
            , theme: '#FF5722'
        }
        , cols: [[
            {field: 'dataId', title: 'ID', width: 70, fixed: 'left', unresize: true}
            , {field: 'eventName', title: '活动名称', width: 250}
            , {field: 'eventTime', sort: true, title: '活动时间', width: 160}
            , {field: 'location', title: '活动地点', width: 190}
            , {field: 'sign', title: '详情'}
            , {fixed: 'right', title: '操作', toolbar: '#barDemo', width: 130}
        ]]
    });

    //正在跟进数据表
    table.render({
        elem: '#do_event'
        , url: '../../data/getAgreeingData'
        , toolbar: '#toolbarDemo1'
        , title: '数据表'
        , cellMinWidth: 180
        , height: 'full-200'
        , page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
            layout: ['limit', 'prev', 'page', 'next', 'skip', 'count'] //自定义分页布局
            //,curr: 5 //设定初始在第 5 页
            , groups: 5 //只显示 1 个连续页码
            , first: false //不显示首页
            , last: false //不显示尾页
            , theme: '#FF5722'
        }
        , cols: [[
            {field: 'agreeDataId', title: 'ID', width: 70, fixed: 'left', unresize: true}
            , {field: 'eventName', title: '活动名称'}
            , {field: 'eventTime', sort: true, title: '活动时间'}
            , {field: 'location', title: '活动地点'}
            , {field: 'picName', title: '负责人', width: 100}
            , {field: 'picNum', title: '负责人电话', width: 150}

            , {fixed: 'right', title: '操作', toolbar: '#barDemo1', fixed: 'right',width: 100}
        ]]
    });
    //不跟进的活动数据表
    table.render({
        elem: '#not_follow'
        , url: '../../data/getRefuseData'
        , toolbar: '#toolbarDemo2'
        , title: '数据表'
        , cellMinWidth: 180
        , height: 'full-200'
        , page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
            layout: ['limit', 'prev', 'page', 'next', 'skip', 'count'] //自定义分页布局
            //,curr: 5 //设定初始在第 5 页
            , groups: 5 //只显示 1 个连续页码
            , first: false //不显示首页
            , last: false //不显示尾页
            , theme: '#FF5722'
        }
        , cols: [[
            {field: 'refuseDataId', title: 'ID', width: 70, fixed: 'left', unresize: true}
            , {field: 'eventName', title: '活动名称', width: 250}
            , {field: 'eventTime', sort: true, title: '活动时间', width: 160}
            , {field: 'location', title: '活动地点'}
            , {field: 'sign', title: '详情'}
            , {field: 'refuseReason', title: '不跟进原因', minwidth: 180, style: 'color: #CD3700;'}
        ]]
    });
    // 已完成的活动数据表
    table.render({
        elem: '#done_event'
        , url: '../../data/getFinishData'
        , toolbar: '#toolbarDemo3'
        , title: '数据表'
        , cellMinWidth: 180
        , height: 'full-200'
        , page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
            layout: ['limit', 'prev', 'page', 'next', 'skip', 'count'] //自定义分页布局
            //,curr: 5 //设定初始在第 5 页
            , groups: 5 //只显示 1 个连续页码
            , first: false //不显示首页
            , last: false //不显示尾页
            , theme: '#FF5722'
        }
        , cols: [[
            {field: 'agreeDataId', title: 'ID', width: 70, fixed: 'left', unresize: true}
            , {field: 'eventName', title: '活动名称', width: 250}
            , {field: 'eventTime', sort: true, title: '活动时间', width: 160}
            , {field: 'location', title: '活动地点'}
            , {field: 'picName', title: '负责人', minwidth: 80}
            , {field: 'picNum', title: '负责人电话', minwidth: 150}
            , {field: 'finalNum', title: '最终发展量(户)', width: 140, style: 'color:green', fixed: 'right'}
        ]]
    });

    //监听行工具事件
    table.on('tool(new_event)', function (obj) {
        var data = obj.data;
        var formhtml1 = '<div class="formctrl"><form class="layui-form layui-form-pane" action=""><div class="layui-form-item"><label class="layui-form-label"><b>现场负责人</b></label><div class="layui-input-inline"><input id="picName" type="text" name="picName" lay-verify="required" placeholder="请输入负责人姓名" autocomplete="off" class="layui-input"></div></div><div class="layui-form-item"><label class="layui-form-label"><b>联系方式</b></label><div class="layui-input-inline"><input type="text" id="picNum" name="picNum" lay-verify="required" placeholder="请输入负责人电话号码" autocomplete="off" class="layui-input"></div></div><div class="layui-form-item"><div class="layui-input-block"><button id="agreeButton" class="layui-btn">跟进</button></div></div></form></div> '
        var formhtml2 = '<div class="formctrl"><form class="layui-form layui-form-pane" action=""><div class="layui-form-item layui-form-text"><label class="layui-form-label"><b>请在下方填写不跟进的原因</b></label><div class="layui-input-block"><textarea placeholder="请输入内容" id="refuseReason" name="refuseReason" class="layui-textarea"></textarea></div></div><div class="layui-form-item"><div class="layui-input-block"><button id="refuseButton" class="layui-btn">确定</button></div></div></form></div> '
        //点击跟进之后的操作
        if (obj.event === 'follow') {
            var index = layer.open({
                type: 1 //Page层类型
                , area: ['500px', '300px']
                , title: '请录入信息'
                , shade: 0.6 //遮罩透明度
                , maxmin: true //允许全屏最小化
                , anim: 5 //0-6的动画形式，-1不开启
                , content: formhtml1
            });

            $("#agreeButton").click(function () {
                var dataId = data.dataId;
                console.log(dataId);
                var picName = document.getElementById('picName').value;
                var picNum = document.getElementById('picNum').value;
                console.log(picName);
                console.log(picNum);
                $.ajax({
                    type: "post",
                    url: "../../data/agreeData",
                    data: {
                        'agreeDataId': dataId,
                        'picName': picName,
                        'picNum': picNum
                    },
                    dataType: "json",
                    success: function (data) {
                        alert(data);
                        window.parent.location.reload();
                        layer.close(index);
                    },
                    error: function (data) {
                        alert("出错了，返回的data：" + data);
                    }
                });
                return false;
            })

        } //点击不跟进之后的操作
        else if (obj.event === 'refuse') {
            layer.open({
                type: 1 //Page层类型
                , area: ['500px', '300px']
                , title: '请录入信息'
                , shade: 0.6 //遮罩透明度
                , maxmin: true //允许全屏最小化
                , anim: 5 //0-6的动画形式，-1不开启
                , content: formhtml2
            });
            $("#refuseButton").click(function () {
                var dataId = data.dataId;
                console.log(dataId);
                var refuseReason = document.getElementById('refuseReason').value;
                console.log(refuseReason);
                $.ajax({
                    type: "post",
                    url: "../../data/refuseData",
                    data: {
                        'refuseDateId': dataId,
                        'refuseReason': refuseReason
                    },
                    dataType: "json",
                    success: function (data) {
                        alert(data);
                        window.parent.location.reload();
                        layer.close(index);
                    },
                    error: function (data) {
                        alert("出错了，返回的data：" + data);
                    }
                });
                return false;
            })
        }

    });

    table.on('tool(do_event)', function (obj) {
        var data = obj.data;
        var formhtml3 = '<div class="formctrl"><form class="layui-form layui-form-pane" action=""><div class="layui-form-item"><label class="layui-form-label"><b>最终发展量</b></label><div class="layui-input-inline"><input type="text" id="finalNum" name="finalNum" lay-verify="required" placeholder="请输入最终发展量" autocomplete="off" class="layui-input"></div></div><div class="layui-form-item"><div class="layui-input-block"><button id="finalNumButton" class="layui-btn">提交</button></div></div></form><div class="tips">Tip: 请确保活动已经开展完成后填写</div></div> '

        //点击跟进之后的操作
        if (obj.event === 'done') {
            layer.open({
                type: 1 //Page层类型
                , area: ['500px', '300px']
                , title: ''
                , shade: 0.6 //遮罩透明度
                , maxmin: true //允许全屏最小化
                , anim: 5 //0-6的动画形式，-1不开启
                , content: formhtml3
            });
            $("#finalNumButton").click(function () {
                var agreeDataId = data.agreeDataId;
                console.log(agreeDataId);
                var finalNum = document.getElementById('finalNum').value;
                console.log(finalNum);
                $.ajax({
                    type: "post",
                    url: "../../data/finalNumFeedBack",
                    data: {
                        'agreeDataId': agreeDataId,
                        'finalNum': finalNum
                    },
                    dataType: "json",
                    success: function (data) {
                        alert(data);
                        window.parent.location.reload();
                        layer.close(index);
                    },
                    error: function (data) {
                        alert("出错了，返回的data：" + data);
                    }
                });
                return false;
            })
        }
    });
});
//选项卡
layui.use('element', function () {
    var $ = layui.jquery
    var element = layui.element;

    var layid = location.hash.replace(/^#test=/, '');
    element.tabChange('test', layid);

    element.on('tab(test)', function (elem) {
        location.hash = 'test=' + $(this).attr('lay-id');
    });
});
