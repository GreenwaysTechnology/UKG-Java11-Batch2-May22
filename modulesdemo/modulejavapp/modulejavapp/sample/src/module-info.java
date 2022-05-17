//open module sample {
//    exports com.ukg.sample;
////    exports com.ukg.sample.util;
////    exports com.ukg.demo;
//}

module sample {
    opens com.ukg.sample;
    exports com.ukg.sample;
//    exports com.ukg.sample.util;
//    exports com.ukg.demo;
}