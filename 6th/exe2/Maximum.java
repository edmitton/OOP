public class Maximum {
  public int max(int[] array) {
    int max = array[0];
    for (int i = 0; i < array.length; i++) {
      max = Math.max(max, array[i]);
    }
    return max;
  }

  public int max(int x, int y, int z) {
    int max = x;
    max = Math.max(max, y);
    max = Math.max(max, z);

    return max;
  }
}
