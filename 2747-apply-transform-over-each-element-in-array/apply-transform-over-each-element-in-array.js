/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
const map = (arr, fn)=> {//fundamental note that function is passed as a parameter, this function is defined by the user and then applied on forEach element.
    const transformedArr = [];
  arr.forEach((element, index) => {
    transformedArr[index] = fn(element, index);
  });
  return transformedArr;
};