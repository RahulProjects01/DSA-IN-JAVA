// import java.util.*;

// public class Main {
//   public static void main(String[] args) {
//     HashMap<Integer, String> hm = new HashMap<>();
//     // adding element
//     hm.put(21, "regex");
//     hm.put(45, "hello");
//     hm.put(67, "hii");
//     hm.put(23, "show");
//     // getting value of a key from the hashmap
//     System.out.println(hm.get("regex"));
//     // changing a value key int the hashmap
//     // removing a pair from the hashmap
//     // checking if a key in the hashmap
//     // adding a new wntry onlt if the new key does not exist
//     // get all keys in the hashmap
//     // getting values in the hashmap
//     // getting all entries in the hashmap
//   }
// }
// ----------------------------------------------------
// important features of hashmap class :

// 1)to access a value one must know its key 


// 2)hashmap does not allow duplicate keys but it allows duplicate values ,that means a single key can not more than one value but more than one key can contain single value.

// 3)java hashmap maintain no order 
// -------------------------------------------------------
// Applications of hashmap : 

// 1)problem realted to frequency of an item 

// 2)mapping problem 

// 3)storage optimization 

// 4)dicitinary 

// 5)phonebook 
// ---------------------------------------------------------------------------
// problem realted to frequency of an item
// import java.util.*;

// public class Main {
//   public static void main(String[] args) {
//     int[] arr = { 1, 4, 2, 5, 1, 4, 4, 6, 4, 4, 4, 4, };
//     Map<Integer, Integer> hs = new HashMap<>();
//     for (int el : arr) {
//       if (!hs.containsKey(el)) {
//         hs.put(el, 1);
//       } else {
//         hs.put(el, hs.get(el) + 1);
//       }
//     }
//     System.out.println(hs.entrySet());
//   }
// }
// ---------------------------------------------------------------------
// import java.util.*;

// public class Main {
//   public static void main(String[] args) {
//     int arr[] = { 1, 4, 2, 5, 1, 4, 4, 6, 4, 4, 4, 4, };
//     Map<Integer, Integer> fre = new HashMap<>();
//     for (int el : arr) {
//       if (!fre.containsKey(el)) {
//         fre.put(el, 1);
//       } else {
//         fre.put(el, fre.get(el) + 1);
//       }
//     }
//     System.out.println(fre.entrySet());
//     int maxFre = 0, ansKey = -1;
//     for (var e : fre.entrySet()) {
//       if (e.getKey() > maxFre) {
//         maxFre = e.getValue();
//         ansKey = e.getKey();
//       }
//     }
//     System.out.printf("%d has a max frequency", ansKey);
//   }
// }
// -------------------------------------------------------------------


