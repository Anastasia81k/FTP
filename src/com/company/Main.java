package com.company;


import java.net.*;
import java.io.*;
import java.util.*;


class Main
{
    public static void main(String args[]) throws Exception
    {
        Socket soc=new Socket("127.0.0.1",5217);
        transferfileClient t=new transferfileClient(soc);
        t.displayMenu();

    }
}
