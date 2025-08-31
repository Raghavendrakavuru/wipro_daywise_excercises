// btn1=document.getElementById("btn1");
// btn1.addEventListener("onclick", function fn() {
//     var input = document.getElementById("input").value;
//     console.log(input);
//  });

function updatecount()
{
    let input=document.getElementById("input");
    let remaining=50- input.value.length;
    document.getElementById("charcount").innerText=remaining+"characters remaining";
}