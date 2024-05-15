/*number([[10,0],[3,5],[5,8]])
number([[3,0],[9,1],[4,10],[12,2],[6,1],[7,10]]
number([[3,0],[9,1],[4,8],[12,2],[6,1],[7,8]])
*/

function number(busArret) {
    return busArret.reduce((total, stop) => {
        const [entre, sort] = stop;
        return total + entre - sort; 
    }, 0); 
}
console.log(number([[10,0],[3,5],[5,8]]))
console.log(number([[3,0],[9,1],[4,10],[12,2],[6,1],[7,10]]))
console.log(number([[3,0],[9,1],[4,8],[12,2],[6,1],[7,8]]))