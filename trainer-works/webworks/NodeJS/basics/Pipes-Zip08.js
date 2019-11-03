const fs = require("fs");
const zlib = require("zlib");

const gunZip = zlib.createGunzip();

const newReadStream = fs.createReadStream("./files/nemplolyees.txt.gz");
const writeStream = fs.createWriteStream("./files/uncompress.txt");

/* newReadStream.pipe(gunZip).on("error", (err) => {
    console.log(err);
}).pipe(writeStream).on("error", (err)=>{
    console.log(err);
});
 */

 newReadStream.pipe(gunZip).pipe(writeStream); 