enum HttpStatusCode{
OK=200,
NOTFOUND=404,
ACESSDENIED=403,
INTERNALERROR=500
}
console.log("ok "+ HttpStatusCode.OK)
console.log(HttpStatusCode.NOTFOUND);
console.log("Acess denied"+ HttpStatusCode.ACESSDENIED);
console.log("INTERNALERROR : ", HttpStatusCode.INTERNALERROR);