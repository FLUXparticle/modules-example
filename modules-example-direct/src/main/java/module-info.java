module modules.example.direct {
    requires transitive modules.example.indirect;

    exports com.example.direct;
}
