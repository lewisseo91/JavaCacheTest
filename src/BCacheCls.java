public class BCacheCls extends SharedCacheClass {

//    public BCacheCls() {
//        super();
//    }

    public BCacheCls(String[] cachedArr) {
        this.cachedArr = cachedArr;
        System.out.println(System.identityHashCode(this.cachedArr[0]));
    }

    public String bResult() {
        return this.cachedArr[0];
    }

//    public String getCachedCls() {
//        System.out.println(super.getValueIdx(0));
//        System.out.println(System.identityHashCode(super.getValueIdx(0)));
//        return super.getValueIdx(0);
//    }
}
