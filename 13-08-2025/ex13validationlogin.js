function validateForm(){
    var email=document.getElementById("email").Value;
    var password=document.getElementById("password").Value;
    var regexp=/\w+([0-9.!#$%^&*+/=?-]\w+)*@\w+(\.\w{2,3})/;
    var regexppswd=/\w+([!@#$%^#%^&*0-9]\w)/;

    console.log(email);
    console.log(password);

     if(regexp.test(email)==true)
    {
        document.getElementById("span1").innerHTML="valid email";
        //document.write("valid email");
    }
    else if(regexppswd.test(password)==true){ 
       var a= document.getElementById("span2").innerHTML="valid password";
        //document.write("valid password");
        
    }else{
        document.getElementById("span1" ).innerHTML="invalid email";
        //document.write("invalid email");
    }
 email.addEventListener("blur",validateForm);

}