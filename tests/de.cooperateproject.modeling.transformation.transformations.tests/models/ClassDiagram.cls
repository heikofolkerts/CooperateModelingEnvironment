<?xml version="1.0" encoding="UTF-8"?>
<cls:ClassDiagram xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:cls="http://www.cooperateproject.de/modeling/textual/cls/Cls" xmlns:uml="http://www.eclipse.org/uml2/5.0.0/UML" xsi:schemaLocation="http://www.cooperateproject.de/modeling/textual/cls/Cls ../../de.cooperateproject.modeling.textual.cls.metamodel/model/cls.ecore" name="Class Diagram">
  <packageImports>
    <package href="ClassDiagram.uml#_Opgx0EKSEeaXCq-9LXQNWQ"/>
  </packageImports>
  <classifiers xsi:type="cls:Class">
    <referencedElement xsi:type="uml:Class" href="ClassDiagram.uml#_QHekoEKSEeaXCq-9LXQNWQ"/>
    <members xsi:type="cls:Attribute" visibility="PUBLIC">
      <referencedElement xsi:type="uml:Property" href="ClassDiagram.uml#_sLlvoEKSEeaXCq-9LXQNWQ"/>
      <type xsi:type="cls:DataTypeReference" type="STRING"/>
    </members>
    <members xsi:type="cls:Method" visibility="PUBLIC">
      <referencedElement xsi:type="uml:Operation" href="ClassDiagram.uml#_WwgHEEKSEeaXCq-9LXQNWQ"/>
      <parameters visibility="PROTECTED">
        <referencedElement xsi:type="uml:Parameter" href="ClassDiagram.uml#_Z8Kx0EKSEeaXCq-9LXQNWQ"/>
        <type xsi:type="cls:DataTypeReference"/>
      </parameters>
    </members>
  </classifiers>
  <classifiers xsi:type="cls:Class">
    <referencedElement xsi:type="uml:Class" href="ClassDiagram.uml#_Qr2dAEKSEeaXCq-9LXQNWQ"/>
    <members xsi:type="cls:Attribute" visibility="PUBLIC">
      <referencedElement xsi:type="uml:Property" href="ClassDiagram.uml#_oNOcoEKSEeaXCq-9LXQNWQ"/>
      <type xsi:type="cls:DataTypeReference" type="DOUBLE"/>
    </members>
  </classifiers>
  <classifiers xsi:type="cls:Class">
    <referencedElement xsi:type="uml:Class" href="ClassDiagram.uml#_xEjCoEKSEeaXCq-9LXQNWQ"/>
    <members xsi:type="cls:Attribute" visibility="PUBLIC">
      <referencedElement xsi:type="uml:Property" href="ClassDiagram.uml#_5_7pQEKSEeaXCq-9LXQNWQ"/>
      <type xsi:type="cls:DataTypeReference"/>
    </members>
  </classifiers>
  <connectors xsi:type="cls:Association" aggregationKind="COMPOSITION">
    <left xsi:type="cls:UMLTypeReference">
      <type xsi:type="uml:Class" href="ClassDiagram.uml#_Qr2dAEKSEeaXCq-9LXQNWQ"/>
    </left>
    <right xsi:type="cls:UMLTypeReference">
      <type xsi:type="uml:Class" href="ClassDiagram.uml#_QHekoEKSEeaXCq-9LXQNWQ"/>
    </right>
    <referencedElement xsi:type="uml:Association" href="ClassDiagram.uml#_RpctsEKSEeaXCq-9LXQNWQ"/>
    <properties>
      <cardinalityLeft lowerBound="1" upperBound="-1"/>
      <cardinalityRight lowerBound="1" upperBound="1"/>
    </properties>
  </connectors>
  <connectors xsi:type="cls:Generalization">
    <left xsi:type="cls:UMLTypeReference">
      <type xsi:type="uml:Class" href="ClassDiagram.uml#_xEjCoEKSEeaXCq-9LXQNWQ"/>
    </left>
    <right xsi:type="cls:UMLTypeReference">
      <type xsi:type="uml:Class" href="ClassDiagram.uml#_QHekoEKSEeaXCq-9LXQNWQ"/>
    </right>
  </connectors>
  <connectors xsi:type="cls:CommentLink">
    <comment href="ClassDiagram.uml#_-pP9wEKSEeaXCq-9LXQNWQ"/>
    <left xsi:type="cls:UMLTypeReference">
      <type xsi:type="uml:Class" href="ClassDiagram.uml#_xEjCoEKSEeaXCq-9LXQNWQ"/>
    </left>
  </connectors>
  <connectors xsi:type="cls:CommentLink">
    <comment href="ClassDiagram.uml#_DX9voEKTEeaXCq-9LXQNWQ"/>
    <left xsi:type="cls:UMLTypeReference">
      <type xsi:type="uml:Association" href="ClassDiagram.uml#_RpctsEKSEeaXCq-9LXQNWQ"/>
    </left>
  </connectors>
</cls:ClassDiagram>