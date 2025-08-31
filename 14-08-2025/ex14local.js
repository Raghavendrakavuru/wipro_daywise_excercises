function login(){
let user=document.getElementById("id").value;
let pass=document.getElementById("password").value;

    if(user) {
      localStorage.setItem("userid", user);
      document.getElementById("status").innerText = "Logged in as: " + user;
    } 
    else {
      alert("Please enter both User ID and Password");
    }
}

  function logout() {
    localStorage.removeItem("user");
    document.getElementById("status").innerText = "Logged out";
  }

  // Check if already logged in
  window.onload = function() {
    let savedUser = localStorage.getItem("user");
    if(savedUser) {
      document.getElementById("status").innerText = "Logged in as: " + savedUser;
    }
  }
