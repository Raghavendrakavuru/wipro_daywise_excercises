var Box = /** @class */ (function () {
    function Box(value) {
        this.value = value;
    }
    Box.prototype.getValue = function () {
        return this.value;
    };
    return Box;
}());
var b1 = new Box(33);
var b2 = new Box("Raghavendra");
console.log(b1);
console.log(b2);
