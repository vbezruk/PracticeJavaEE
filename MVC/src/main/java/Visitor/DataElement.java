/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitor;

import java.util.TreeMap;

public interface DataElement {
    public TreeMap accept(DataElementsVisitor visitor);
}