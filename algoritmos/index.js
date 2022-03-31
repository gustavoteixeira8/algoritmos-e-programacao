function binary_search(array, value) {
  let head = 0;
  let tail = array.length - 1;

  while (tail > head) {
    const arrayMiddle = Math.ceil((head + tail) / 2);

    if (array[arrayMiddle] === value) {
      return arrayMiddle;
    }

    if (array[arrayMiddle] < value) {
      head = arrayMiddle;
    } else {
      tail = arrayMiddle;
    }
  }

  return -1;
}

const array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

console.log(binary_search(array, 9));
