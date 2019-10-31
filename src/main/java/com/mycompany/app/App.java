/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Remote World!" );
        Scanner s = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        int x = s.nextInt();
        System.out.println("Die Zahl: " + x);
    }
}
