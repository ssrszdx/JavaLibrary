public enum HEnum {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER
}
 enum HEnumTest{
     FIREWALL("firewall"),
     SECRET("secretMac"),
     BALANCE("f5");

     private String typeName;

     HEnumTest(String typeName) {
         this.typeName = typeName;
     }

}
