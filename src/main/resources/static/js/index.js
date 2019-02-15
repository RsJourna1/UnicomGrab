layui.use('table', function () {
    var table = layui.table;
    //最新活动大麦数据表
    table.render({
        elem: '#new_event_damai'
        , url: '../../data/getDamaiUIData/'
        , toolbar: '#toolbarDemo_damai'
        , title: '数据表'
        , cellMinWidth: 180
        , height: 'full-200'
        , page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
            layout: ['count'] //自定义分页布局
            // 'limit', 'prev', 'page', 'next', 'skip',
            //,curr: 5 //设定初始在第 5 页
            // , groups: 5 //只显示 1 个连续页码
            , first: false //不显示首页
            , last: false //不显示尾页
            , theme: '#FF5722'
        }
        , cols: [[
            // {field: 'damaiId', title: 'ID', width: 70, fixed: 'left', unresize: true}
            // ,
            {field: 'name', title: '活动名称', width: 250}
            , {field: 'showtime', sort: true, title: '活动时间', width: 160}
            , {field: 'venue', title: '活动地点', width: 190}
            , {field: 'description', title: '详情'}
            , {fixed: 'right', title: '操作', toolbar: '#barDemo_damai', width: 130}
        ]]
    });
    //最新活动豆瓣数据表
    table.render({
        elem: '#new_event_douban'
        , url: '../../data/getDoubanUIData'
        , toolbar: '#toolbarDemo_douban'
        , title: '数据表'
        , cellMinWidth: 180
        , height: 'full-200'
        , page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
            layout: ['count'] //自定义分页布局
            // 'limit', 'prev', 'page', 'next', 'skip',
            //,curr: 5 //设定初始在第 5 页
            // , groups: 5 //只显示 1 个连续页码
            , first: false //不显示首页
            , last: false //不显示尾页
            , theme: '#FF5722'
        }
        , cols: [[
            // {field: 'doubanId', title: 'ID', width: 70, fixed: 'left', unresize: true}
            // ,
            {field: 'name', title: '活动名称', width: 250}
            , {field: 'showtime', sort: true, title: '活动时间', width: 160}
            , {field: 'venue', title: '活动地点', width: 190}
            , {field: 'description', title: '详情'}
            , {fixed: 'right', title: '操作', toolbar: '#barDemo_douban', width: 130}
        ]]
    });
    var username = $("#usernameFlag").val();
    //正在跟进数据表
    table.render({
        elem: '#do_event'
        , url: '../../data/getAgreeingData/' + username
        , toolbar: '#toolbarDemo1'
        , title: '数据表'
        , cellMinWidth: 180
        , height: 'full-200'
        , page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
            layout: ['count'] //自定义分页布局
            // 'limit', 'prev', 'page', 'next', 'skip',
            //,curr: 5 //设定初始在第 5 页
            // , groups: 5 //只显示 1 个连续页码
            , first: false //不显示首页
            , last: false //不显示尾页
            , theme: '#FF5722'
        }
        , cols: [[
            // {field: 'agreeDataId', title: 'ID', width: 70, fixed: 'left', unresize: true}
            // ,
            {field: 'name', title: '活动名称'}
            , {field: 'showtime', sort: true, title: '活动时间'}
            , {field: 'venue', title: '活动地点'}
            , {field: 'picName', title: '负责人', width: 80}
            , {field: 'picNum', title: '负责人电话', width: 120}
            , {field: 'county', title: '县分', width: 80}
            , {field: 'realName', title: '操作员', width: 80}

            , {fixed: 'right', title: '操作', toolbar: '#barDemo1', fixed: 'right', width: 120}
        ]]
    });
    //不跟进的活动数据表
    table.render({
        elem: '#not_follow'
        , url: '../../data/getRefuseData/' + username
        , toolbar: '#toolbarDemo2'
        , title: '数据表'
        , cellMinWidth: 180
        , height: 'full-200'
        , page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
            layout: ['count'] //自定义分页布局
            // 'limit', 'prev', 'page', 'next', 'skip',
            //,curr: 5 //设定初始在第 5 页
            // , groups: 5 //只显示 1 个连续页码
            , first: false //不显示首页
            , last: false //不显示尾页
            , theme: '#FF5722'
        }
        , cols: [[
            // {field: 'refuseDataId', title: 'ID', width: 70, fixed: 'left', unresize: true}
            // ,
            {field: 'name', title: '活动名称'}
            , {field: 'showtime', sort: true, title: '活动时间'}
            , {field: 'venue', title: '活动地点'}
            , {field: 'description', title: '详情'}
            , {field: 'refuseReason', title: '不跟进原因', minwidth: 180, style: 'color: #CD3700;'}
            , {field: 'county', title: '县分', width: 80}
            , {field: 'realName', title: '操作员', width: 80}
        ]]
    });
    // 已完成的活动数据表
    table.render({
        elem: '#done_event'
        , url: '../../data/getFinishData/' + username
        , toolbar: '#toolbarDemo3'
        , title: '数据表'
        , cellMinWidth: 180
        , height: 'full-200'
        , page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
            layout: ['count'] //自定义分页布局
            // 'limit', 'prev', 'page', 'next', 'skip',
            //,curr: 5 //设定初始在第 5 页
            // , groups: 5 //只显示 1 个连续页码
            , first: false //不显示首页
            , last: false //不显示尾页
            , theme: '#FF5722'
        }
        , cols: [[
            // {field: 'agreeDataId', title: 'ID', width: 70, fixed: 'left', unresize: true}
            // ,
            {field: 'name', title: '活动名称'}
            , {field: 'showtime', sort: true, title: '活动时间'}
            , {field: 'venue', title: '活动地点'}
            , {field: 'picName', title: '负责人', width: 80}
            , {field: 'picNum', title: '负责人电话', width: 120}
            , {field: 'county', title: '县分', width: 80}
            , {field: 'finalNum', title: '最终发展情况', width: 140, style: 'color:green'}
            , {field: 'realName', title: '操作员', width: 80}
        ]]
    });

    //监听行工具事件
    //大麦
    table.on('tool(new_event_damai)', function (obj) {
        var data = obj.data;
        var formhtml1 =
            '<div class="formctrl">' +
            '<form class="layui-form layui-form-pane" action="">' +
            '<div class="layui-form-item">' +
            '<label class="layui-form-label">' +
            '<b>现场负责人</b>' +
            '</label>' +
            '<div class="layui-input-inline">' +
            '<input id="picDamaiName" type="text" name="picDamaiName" lay-verify="required" placeholder="请输入负责人姓名" autocomplete="off" class="layui-input">' +
            '</div>' +
            '</div>' +
            '<div class="layui-form-item">' +
            '<label class="layui-form-label">' +
            '<b>联系方式</b>' +
            '</label>' +
            '<div class="layui-input-inline">' +
            '<input type="text" id="picDamaiNum" name="picDamaiNum" lay-verify="required" placeholder="请输入负责人电话号码" autocomplete="off" class="layui-input">' +
            '</div>' +
            '</div>' +
            '<div class="layui-form-item">' +
            '<label class="layui-form-label">' +
            '<b>县分</b>' +
            '</label>' +
            '<div class="layui-input-inline">' +
            '<input type="text" id="countyDamai1" name="countyDamai1" lay-verify="required" placeholder="请输入县分" autocomplete="off" class="layui-input">' +
            '</div>' +
            '</div>' +
            '<div class="layui-form-item">' +
            '<div class="layui-input-block">' +
            '<button id="agreeDamaiButton" class="layui-btn">跟进</button>' +
            '</div>' +
            '</div>' +
            '</form>' +
            '</div>';
        var formhtml2 =
            '<div class="formctrl">' +
            '<form class="layui-form layui-form-pane" action="">' +
            '<div class="layui-form-item layui-form-text">' +
            '<label class="layui-form-label">' +
            '<b>请在下方填写不跟进的原因</b>' +
            '</label>' +
            '<div class="layui-input-block">' +
            '<textarea placeholder="请输入内容" id="refuseDamaiReason" name="refuseDamaiReason" class="layui-textarea"></textarea>' +
            '</div>' +
            '</div>' +
            '<div class="layui-form-item">' +
            '<label class="layui-form-label">' +
            '<b>县分</b>' +
            '</label>' +
            '<div class="layui-input-inline">' +
            '<input type="text" id="countyDamai2" name="countyDamai2" lay-verify="required" placeholder="请输入县分" autocomplete="off" class="layui-input">' +
            '</div>' +
            '</div>' +
            '<div class="layui-form-item">' +
            '<div class="layui-input-block">' +
            '<button id="refuseDamaiButton" class="layui-btn">确定</button>' +
            '</div>' +
            '</div>' +
            '</form>' +
            '</div>';
        //点击跟进大麦之后的操作
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

            $("#agreeDamaiButton").click(function () {
                var username = $("#usernameFlag").val();
                var realName = $("#userRealNameFlag").val();
                var md5 = data.md5;
                var picDamaiName = document.getElementById('picDamaiName').value;
                var picDamaiNum = document.getElementById('picDamaiNum').value;
                var countyDamai1 = document.getElementById('countyDamai1').value;
                $.ajax({
                    type: "post",
                    url: "../../data/agreeDamaiData",
                    data: {
                        'md5': md5,
                        'picName': picDamaiName,
                        'picNum': picDamaiNum,
                        'username': username,
                        'realName': realName,
                        'county': countyDamai1
                    },
                    dataType: "json",
                    success: function (data) {
                        // alert(data);
                        if (data == 3) {
                            alert("发展人或号码不能为空");
                            window.parent.location.reload();
                            layer.close(index);
                        } else if (data == 1) {
                            alert("操作成功");
                            window.parent.location.reload();
                            layer.close(index);
                        } else if (data == 0) {
                            alert("操作失败 已有用户操作该数据");
                            window.parent.location.reload();
                            layer.close(index);
                        }
                    },
                    error: function (data) {
                        alert("出错了，返回的data：" + data);
                    }
                });
                return false;
            })

        } //点击不跟进大麦之后的操作
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
            $("#refuseDamaiButton").click(function () {
                var username = $("#usernameFlag").val();
                var realName = $("#userRealNameFlag").val();
                var md5 = data.md5;
                var refuseReason = document.getElementById('refuseDamaiReason').value;
                var county = document.getElementById('countyDamai2').value;
                $.ajax({
                    type: "post",
                    url: "../../data/refuseDamaiData",
                    data: {
                        'md5': md5,
                        'refuseReason': refuseReason,
                        'username': username,
                        'realName': realName,
                        'county': county
                    },
                    dataType: "json",
                    success: function (data) {
                        // alert(data);
                        if (data == 3) {
                            alert("原因不能为空");
                            window.parent.location.reload();
                            layer.close(index);
                        } else if (data == 1) {
                            alert("操作成功");
                            window.parent.location.reload();
                            layer.close(index);
                        } else if (data == 0) {
                            alert("操作失败 已有用户操作该数据");
                            window.parent.location.reload();
                            layer.close(index);
                        }
                    },
                    error: function (data) {
                        alert("出错了，返回的data：" + data);
                    }
                });
                return false;
            })
        }

    });
    //豆瓣
    table.on('tool(new_event_douban)', function (obj) {
        var data = obj.data;
        var formhtml3 =
            '<div class="formctrl">' +
            '<form class="layui-form layui-form-pane" action="">' +
            '<div class="layui-form-item">' +
            '<label class="layui-form-label">' +
            '<b>现场负责人</b>' +
            '</label>' +
            '<div class="layui-input-inline">' +
            '<input id="picDoubanName" type="text" name="picDoubanName" lay-verify="required" placeholder="请输入负责人姓名" autocomplete="off" class="layui-input">' +
            '</div>' +
            '</div>' +
            '<div class="layui-form-item"><label class="layui-form-label">' +
            '<b>联系方式</b>' +
            '</label><div class="layui-input-inline">' +
            '<input type="text" id="picDoubanNum" name="picDoubanNum" lay-verify="required" placeholder="请输入负责人电话号码" autocomplete="off" class="layui-input">' +
            '</div>' +
            '</div>' +
            '<div class="layui-form-item">' +
            '<label class="layui-form-label">' +
            '<b>县分</b>' +
            '</label>' +
            '<div class="layui-input-inline">' +
            '<input id="countyDouban1" type="text" name="countyDouban1" lay-verify="required" placeholder="请输入县分" autocomplete="off" class="layui-input">' +
            '</div>' +
            '</div>' +
            '<div class="layui-form-item">' +
            '<div class="layui-input-block">' +
            '<button id="agreeDoubanButton" class="layui-btn">跟进</button>' +
            '</div>' +
            '</div>' +
            '</form>' +
            '</div>';
        var formhtml4 =
            '<div class="formctrl">' +
            '<form class="layui-form layui-form-pane" action="">' +
            '<div class="layui-form-item layui-form-text">' +
            '<label class="layui-form-label">' +
            '<b>请在下方填写不跟进的原因</b>' +
            '</label>' +
            '<div class="layui-input-block">' +
            '<textarea placeholder="请输入内容" id="refuseDoubanReason" name="refuseDoubanReason" class="layui-textarea"></textarea>' +
            '</div>' +
            '</div>' +
            '<div class="layui-form-item">' +
            '<label class="layui-form-label">' +
            '<b>县分</b>' +
            '</label>' +
            '<div class="layui-input-inline">' +
            '<input id="countyDouban2" type="text" name="countyDouban2" lay-verify="required" placeholder="请输入县分" autocomplete="off" class="layui-input">' +
            '</div>' +
            '</div>' +
            '<div class="layui-form-item">' +
            '<div class="layui-input-block">' +
            '<button id="refuseDoubanButton" class="layui-btn">确定</button>' +
            '</div>' +
            '</div>' +
            '</form>' +
            '</div>';
        //点击跟进豆瓣之后的操作
        if (obj.event === 'follow') {
            var index = layer.open({
                type: 1 //Page层类型
                , area: ['500px', '300px']
                , title: '请录入信息'
                , shade: 0.6 //遮罩透明度
                , maxmin: true //允许全屏最小化
                , anim: 5 //0-6的动画形式，-1不开启
                , content: formhtml3
            });

            $("#agreeDoubanButton").click(function () {
                var username = $("#usernameFlag").val();
                var realName = $("#userRealNameFlag").val();
                var md5 = data.md5;
                var picDoubanName = document.getElementById('picDoubanName').value;
                var picDoubanNum = document.getElementById('picDoubanNum').value;
                var county = document.getElementById('countyDouban1').value;
                $.ajax({
                    type: "post",
                    url: "../../data/agreeDoubanData",
                    data: {
                        'md5': md5,
                        'picName': picDoubanName,
                        'picNum': picDoubanNum,
                        'username': username,
                        'realName': realName,
                        'county': county
                    },
                    dataType: "json",
                    success: function (data) {
                        // alert(data);
                        if (data == 3) {
                            alert("发展人或号码不能为空");
                            window.parent.location.reload();
                            layer.close(index);
                        } else if (data == 1) {
                            alert("操作成功");
                            window.parent.location.reload();
                            layer.close(index);
                        } else if (data == 0) {
                            alert("操作失败 已有用户操作该数据");
                            window.parent.location.reload();
                            layer.close(index);
                        }
                    },
                    error: function (data) {
                        alert("出错了，返回的data：" + data);
                    }
                });
                return false;
            })

        }
        //点击不跟进豆瓣之后的操作
        else if (obj.event === 'refuse') {
            layer.open({
                type: 1 //Page层类型
                , area: ['500px', '300px']
                , title: '请录入信息'
                , shade: 0.6 //遮罩透明度
                , maxmin: true //允许全屏最小化
                , anim: 5 //0-6的动画形式，-1不开启
                , content: formhtml4
            });
            $("#refuseDoubanButton").click(function () {
                var username = $("#usernameFlag").val();
                var realName = $("#userRealNameFlag").val();
                var md5 = data.md5;
                var refuseReason = document.getElementById('refuseDoubanReason').value;
                var county = document.getElementById('countyDouban2').value;
                $.ajax({
                    type: "post",
                    url: "../../data/refuseDoubanData",
                    data: {
                        'md5': md5,
                        'refuseReason': refuseReason,
                        'username': username,
                        'realName': realName,
                        'county': county
                    },
                    dataType: "json",
                    success: function (data) {
                        // alert(data);
                        if (data == 3) {
                            alert("原因不能为空");
                            window.parent.location.reload();
                            layer.close(index);
                        } else if (data == 1) {
                            alert("操作成功");
                            window.parent.location.reload();
                            layer.close(index);
                        } else if (data == 0) {
                            alert("操作失败 已有用户操作该数据");
                            window.parent.location.reload();
                            layer.close(index);
                        }
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
        var formhtml5 =
            '<div class="formctrl">' +
            '<form class="layui-form layui-form-pane" action="">' +
            '<div class="layui-form-item layui-form-text">' +
            '<label class="layui-form-label">' +
            '<b>请在下方填写具体发展结果</b>' +
            '</label><div class="layui-input-block">' +
            '<textarea placeholder="请输入内容" id="finalNum" name="finalNum" class="layui-textarea"></textarea>' +
            '</div>' +
            '</div>' +
            '<div class="layui-form-item">' +
            '<div class="layui-input-block">' +
            '<button id="finalNumButton" class="layui-btn">提交</button>' +
            '</div>' +
            '</div>' +
            '</form>' +
            '</div>';

        //发展量反馈
        if (obj.event === 'done') {
            layer.open({
                type: 1 //Page层类型
                , area: ['500px', '300px']
                , title: '请录入信息'
                , shade: 0.6 //遮罩透明度
                , maxmin: true //允许全屏最小化
                , anim: 5 //0-6的动画形式，-1不开启
                , content: formhtml5
            });
            $("#finalNumButton").click(function () {
                // var dataId = data.dataId;
                // console.log(dataId);
                var md5 = data.md5;
                // alert(md5);
                var finalNum = document.getElementById('finalNum').value;
                // console.log(finalNum);
                $.ajax({
                    type: "post",
                    url: "../../data/finalNumFeedBack",
                    data: {
                        'md5': md5,
                        'finalNum': finalNum
                    },
                    dataType: "json",
                    success: function (data) {
                        // alert(data);
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
    var $ = layui.jquery;
    var element = layui.element;

    var layid = location.hash.replace(/^#test=/, '');
    element.tabChange('test', layid);

    element.on('tab(test)', function (elem) {
        location.hash = 'test=' + $(this).attr('lay-id');
    });
});
