var HttpStatusCode;
(function (HttpStatusCode) {
    HttpStatusCode[HttpStatusCode["OK"] = 200] = "OK";
    HttpStatusCode[HttpStatusCode["NOTFOUND"] = 404] = "NOTFOUND";
    HttpStatusCode[HttpStatusCode["ACESSDENIED"] = 403] = "ACESSDENIED";
    HttpStatusCode[HttpStatusCode["INTERNALERROR"] = 500] = "INTERNALERROR";
})(HttpStatusCode || (HttpStatusCode = {}));
console.log("ok " + HttpStatusCode.OK);
console.log(HttpStatusCode.NOTFOUND);
console.log("Acess denied" + HttpStatusCode.ACESSDENIED);
console.log("INTERNALERROR : ", HttpStatusCode.INTERNALERROR);