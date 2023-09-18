/**
 * @param {string} val
 * @return {Object}
 */
const expect = (val)=> {
    const toBe= (val2,err)=>{
        if(val===val2)return true;
        else throw new Error(err || "Not Equal");
    }
    const notToBe= (val2,err)=>{
        if(val!==val2)return true;
        else throw new Error(err || "Equal");
    }
    return{toBe,notToBe};
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */