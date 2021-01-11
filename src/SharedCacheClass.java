import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SharedCacheClass {
    String[] cachedArr = new String[25];

//    Map<Integer, String> cachedArr2 = new HashMap<>();
//
//    List<SharedCustomClass> customClasses = new ArrayList<>();
//    private SharedCustomClass exampleCustomClass;

    public SharedCacheClass() {

        for (int i = 0; i < cachedArr.length; i++) {
            cachedArr[i] = "128" + i;
        }
//        cachedArr2.put(0, "128");
//
//        SharedCustomClass sharedCustomClass = new SharedCustomClass("a", "b");
//        exampleCustomClass = sharedCustomClass;
//        customClasses.add(sharedCustomClass);

    }

//    public String getValueIdx(int idx) {
//        return cachedArr[idx];
//    }

//    public String getCachedMap(int key) {
//        return cachedArr2.get(key);
//    }
//
//    public SharedCustomClass getCachedCustomClass(int idx) {
//        return customClasses.get(idx);
//    }
//
//    public SharedCustomClass changeCachedCustomClass(int idx) {
//        return customClasses.set(idx, exampleCustomClass);
//    }

    public String[] getCachedArr() {
        return cachedArr;
    }


}
