/**
 * @param {number} millis
 * @return {Promise}
 */

function asleep(m) {
    return new Promise(() => {
        setTimeout(() => {
          console.log("Hello");
        }, m)
    })
}

async function sleep(millis) {
   await asleep(millis)
}

sleep(2000);

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */