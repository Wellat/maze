
function save(){
    validateForm();
    $("#addForm").submit();
}

function validateForm() {
    $('#addForm').validate({
        errorElement: 'div',
        errorClass: 'help-block',
        focusInvalid: false,
        ignore: "",
        rules: {
            usercode :{required:true} ,
            username : {required:true},
            password : {required:true},
            repassword : {required:true},

        },
        messages: {
            usercode:"请选择类型",
            username:"请选择名称",
            password:"请填写创立企业",
            repassword:"请选择注册园区"
        },
        highlight : function(e) {
            $(e).closest('.form-group').removeClass('has-info').addClass('has-error');
        },
        success : function(e) {
            $(e).closest('.form-group').removeClass('has-error').addClass('has-success');
            $(e).remove();
        },
        errorPlacement : function(error, element) {
            if(element.is('.select2')) {
                error.insertAfter(element.siblings('[class*="select2-container"]:eq(0)'));
            }
            else error.insertAfter(element.parent());
        },

        submitHandler: function (form) {
            var url = "/rest/form/addUser";
            commit("addForm",url,"/rest/page/test");
        }
    });
}


function commit(formId,commitUrl,jumpUrl){
    var data = $("#"+formId).serialize();
    $.ajax({
        type:"POST",
        url:"maze" + commitUrl,
        data:data,
        dataType:"json",
        success: function (data){
            if (data.ret == 'success') {
                swal("保存记录成功！", "", "success");
                setTimeout(function () {
                    window.location.href = "maze" + jumpUrl;
                }, 2000);
            } else {
                swal("提示！", data.message, "warning");
            }
            $(".btn-success").removeAttr("disabled");
        }
    });
}
