/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = (n)=> {
    return ()=> {
        n=n+1;
        return n-1;
        
    };
};

const counter=createCounter();