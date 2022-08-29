
function check(){
    if(document.getElementById("password").value === ""){

        document.getElementById("passwordErr").innerHTML = "密码不能为空";
        document.getElementById("passwordErr").style.display = '';


    }
    if(document.getElementById("username").value === ""){

        document.getElementById("usernameErr").innerHTML = "用户名不能为空";
        document.getElementById("usernameErr").style.display = '';



    }
    return !(document.getElementById("password").value === "" || document.getElementById("username").value === "");

}

