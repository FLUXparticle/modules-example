module modules.example.main {
    requires javafx.controls;

    requires modules.example.direct;
    requires modules.example.reflection;

    exports com.example.main; // Wichtig für JavaFX
}
