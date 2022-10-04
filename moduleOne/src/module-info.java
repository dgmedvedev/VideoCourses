module moduleOne {
    exports package1 to moduleTwo;
    // to moduleTwo - необязательно указывать.
    // Но данная запись указывает на то, что package1 будет доступен только в модуле moduleTwo
}