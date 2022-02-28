module com.gluonhq.hello {
    requires javafx.controls;
    requires com.gluonhq.attach.display;
    requires com.gluonhq.attach.util;
    requires com.gluonhq.charm.glisten;
    requires com.gluonhq.attach.storage;

    opens com.gluonhq.hello to javafx.graphics;
}