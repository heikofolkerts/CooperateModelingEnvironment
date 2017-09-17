/*
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.component.tests

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.cmp.cmp.ComponentDiagram
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import static org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.apache.commons.io.IOUtils
import java.util.Collections
import de.cooperateproject.modeling.textual.component.tests.scoping.util.ComponentCustomizedInjectorProvider


@RunWith(XtextRunner)
@InjectWith(ComponentCustomizedInjectorProvider.DefaultProvider)
class ComponentParsingTest extends AbstractComponentTest{

	
	@Inject ValidationTestHelper validationTestHelper
	
	
	override setup() {
		super.setup()
		rs.packageRegistry.put(CmpPackage.eNS_URI, CmpPackage.eINSTANCE)
	}
	
	@Test
	def void emptyDiagramTest() {
		
		val model = '''
			@start-cpd "someDiagram"
			rootPackage RootElement
			@end-cpd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
	}

	@Test
	def void emptyDiagramSpaceInNameTest() {
		
		val model = '''
			@start-cpd "some Diagram"
			rootPackage RootElement
			
			@end-cpd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
	}
	
		@Test
	def void singleInterfaceTest() {
		
		val model = '''
			@start-cpd "someDiagram"
			rootPackage RootElement
			interface iface
			interface "iface 2" as iface
			@end-cpd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
	}
	
	@Test
	def void singleComponentTest() {		
		val model = '''
			@start-cpd "someDiagram"
			rootPackage RootElement
			component testComp { }
			component "Test Comp" as testComp { }
			@end-cpd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
	}
	
		@Test
		def void innerComponentTest() {		
		val model = '''
			@start-cpd "someDiagram"
			rootPackage RootElement
			component testComp {
				component "Test Comp" as testComp { }
			}

			@end-cpd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
	}
	
	@Test
	def void noteTest() {		
		val model = '''
			@start-cpd "someDiagram"
			rootPackage RootElement
			component testComp { 
				note "This is a great and usefull note."				
			}
			interface testIface { 
				note "This is a great and usefull note fore interfaces"				
			}	
			interface testIface note "This is a great and usefull note fore interfaces"				
			
			@end-cpd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
	}
	
	
	@Test
	def void innerInterfaceTest() {		
		val model = '''
			@start-cpd "someDiagram"
			rootPackage RootElement
			component testComp {
				interface testiface { }
			}

			@end-cpd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
	}
	
	
	@Test
	def void singleInterfaceWithElements() {
		val model = '''
			@start-cpd "someDiagram"
			rootPackage RootElement
			interface testiface {
				static testmethod ()
				static age : int
			}
			@end-cpd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)

	}
	
	
	
	@Test
	def void interfaceRelationTest() {		
		val model = '''
			@start-cpd "someDiagram"
			rootPackage RootElement
			component testComp { 
				provide firstRelation testiface
				require "second Relation" as second testiface2
			}
			interface testiface { }
			interface testiface2 { }			
			@end-cpd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
	}
	
	
		@Test
		def void classifierWrongRelationTest() {		
		val model = '''
			@start-cpd "someDiagram"
			rootPackage RootElement
			component testComp { 
				provide testcomponent
				require testcomponent
			}
			component testcomponent { }			
			@end-cpd
		'''.parse(rs)
		val issue  = validationTestHelper.validate(model);
		assertTrue(!issue.isEmpty());		
	}
	
	@Test
	def void classifierRelationTest() {		
		val model = '''
			@start-cpd "someDiagram"
			rootPackage RootElement
			component testComp { }
			component testComp2 { }
			interface iface { }
			isa ( testComp, testComp2)
			abs ( testComp, testComp2)
			man ( testComp, testComp2)
			sub ( testComp, testComp2)
			dep ( testComp, testComp2)
			isa ( testComp, iface)
			abs ( testComp, iface)
			man ( testComp, iface)
			sub ( testComp, iface)
			dep ( testComp, iface)
			@end-cpd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
	}
	
	@Test
	def void interfaceAliasRelationTest() {		
		val model = '''
			@start-cpd "someDiagram"
			rootPackage RootElement
			component testComp { }
			component "testComp2 test" as testComp2 { }
			interface "iface test" as iface { }
			isa ( testComp, testComp2)
			isa ( testComp, iface)
			@end-cpd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
	}
	
	
	@Test
	def void portTest() {		
		val model = '''
			@start-cpd "someDiagram"
			rootPackage RootElement
			component testC
			component testD
			component testComp {
				port portiport realizes testC
				public port port2 realizes testD
			}
			interface testIface { }
			@end-cpd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
	}
	
	@Test
	def void connectorTest() {		
		val model = '''
			@start-cpd "someDiagram"
			rootPackage RootElement
			component testA
			component testComp {
				component innerComp{
					port port2 realizes testA
					con contest (port2, port1)
				}				
				port port1 realizes testA
			}
			@end-cpd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
	}
		
	
	private static def parse(CharSequence text, ResourceSet rs) {
		val r = rs.createResource(URI.createFileURI("testfile.cmp"))
		val is = IOUtils.toInputStream(text);		
		r.load(is, Collections.emptyMap());
		return r.contents.get(0) as ComponentDiagram
	}
}
