/**
 * @param {number} millis
 * @return {Promise}
 */

// function asleep(m) {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             resolve()
//         }, m)
//     })
// }

async function sleep(millis) {
    // await asleep(millis)
    await new Promise((resolve , reject) => setTimeout(() => resolve() , millis))
}

sleep(2000);

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */