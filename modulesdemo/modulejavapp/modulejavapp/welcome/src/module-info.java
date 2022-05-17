module welcome {
    exports com.ukg.welcome;
    requires transitive welcomeparent;
    requires transitive java.sql;
    requires transitive java.logging;
    requires transitive java.net.http;
}