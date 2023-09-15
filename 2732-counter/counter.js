/**
 * @param {number} n
 * @return {Function} counter
 */
const createCounter = (n)=> {
    return ()=> {
        n=n+1;
        return n-1;
        
    };
};

