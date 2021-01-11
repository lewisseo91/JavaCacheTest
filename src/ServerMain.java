import java.util.ArrayList;

public class ServerMain {
    public static void main(String[] args) {
//        SharedCacheClass scc = new SharedCacheClass();
//        ACacheCls a = new ACacheCls();
//        String texta = a.getCachedCls();
//        BCacheCls b = new BCacheCls();
//        String textb = b.getCachedCls();
//
//        System.out.println( texta == textb );
//
//        SharedCacheClass scc2 = new SharedCacheClass();
//
//        System.out.println( scc2.getCachedMap(0));
//        System.out.println( System.identityHashCode(scc2.getCachedMap(0)));
//        int cAddr = System.identityHashCode(scc2.getCachedMap(0));
//        scc2.cachedArr2.put(0, "128");
//        System.out.println( System.identityHashCode(scc2.getCachedMap(0)));
//        int dAddr = System.identityHashCode(scc2.getCachedMap(0));
//        System.out.println( cAddr == dAddr );
//
//        SharedCacheClass scc3 = new SharedCacheClass();
//
//        System.out.println( scc3.getCachedCustomClass(0));
//        System.out.println( System.identityHashCode(scc2.getCachedMap(0)));
//        System.out.println( scc3.changeCachedCustomClass(0));
//        System.out.println( System.identityHashCode(scc2.getCachedMap(0)));

        SharedCacheClass scc4 = new SharedCacheClass();

        ACacheCls aCacheCls = new ACacheCls(scc4.getCachedArr());
        BCacheCls bCacheCls = new BCacheCls(scc4.getCachedArr());
        System.out.println(aCacheCls.aResult() == bCacheCls.bResult());
    }
}
