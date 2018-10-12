/**
 * Source code from the Java Concurrent Programming Coursera course.
 */
package edu.coursera.concurrent;

import java.util.Objects;
import java.util.UUID;

public class PackageInfo {

    private static class Inner1 {
        private String name;
        private String address;

        public Inner1(String name, String address) {
            this.name = name;
            this.address = address;
        }

        @Override
        public boolean equals(Object obj) {
            return Objects.equals(this.name, ((Inner1)obj).name);
        }
    }

    private static class Inner2 {
        private String country;
        private UUID roll;

        public Inner2(String country, UUID roll) {
            this.country = country;
            this.roll = roll;
        }

    }

    public static void main(String[] args) {
        PackageInfo packageInfo = new PackageInfo();
        System.out.println(packageInfo);
        PackageInfo.Inner1 inner1 = new PackageInfo.Inner1("manish", "141");

        PackageInfo packageInfo1 = new PackageInfo();
        System.out.println(packageInfo);
        PackageInfo.Inner1 inner2 = new PackageInfo.Inner1("manoj", "142");

        PackageInfo packageInfo2 = new PackageInfo();
        System.out.println(packageInfo);
        PackageInfo.Inner1 inner3 = new PackageInfo.Inner1("manish", "141");

        System.out.println("inner 1 equals inner2:"+ inner1.equals(inner2));
        System.out.println("inner 1 equals inner3:"+inner1.equals(inner3));

    }

}
