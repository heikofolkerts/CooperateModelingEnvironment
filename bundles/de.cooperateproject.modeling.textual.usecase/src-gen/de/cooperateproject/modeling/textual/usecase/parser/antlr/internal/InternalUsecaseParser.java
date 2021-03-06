package de.cooperateproject.modeling.textual.usecase.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cooperateproject.modeling.textual.usecase.services.UsecaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUsecaseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@start-ucd'", "'@end-ucd'", "'rootElement'", "'abstract'", "'act'", "'as'", "'role'", "'['", "']'", "'sys'", "'{'", "'}'", "'uc'", "'ep'", "'iac'", "'('", "','", "')'", "'card'", "':'", "'isa'", "'inc'", "'ext'", "'cond'", "'note'", "'..'", "'*'", "'.'", "'+'", "'public'", "'-'", "'private'", "'#'", "'protected'", "'~'", "'human'", "'machine'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalUsecaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUsecaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUsecaseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUsecase.g"; }



     	private UsecaseGrammarAccess grammarAccess;

        public InternalUsecaseParser(TokenStream input, UsecaseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UseCaseDiagram";
       	}

       	@Override
       	protected UsecaseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUseCaseDiagram"
    // InternalUsecase.g:65:1: entryRuleUseCaseDiagram returns [EObject current=null] : iv_ruleUseCaseDiagram= ruleUseCaseDiagram EOF ;
    public final EObject entryRuleUseCaseDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseDiagram = null;


        try {
            // InternalUsecase.g:65:55: (iv_ruleUseCaseDiagram= ruleUseCaseDiagram EOF )
            // InternalUsecase.g:66:2: iv_ruleUseCaseDiagram= ruleUseCaseDiagram EOF
            {
             newCompositeNode(grammarAccess.getUseCaseDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCaseDiagram=ruleUseCaseDiagram();

            state._fsp--;

             current =iv_ruleUseCaseDiagram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseCaseDiagram"


    // $ANTLR start "ruleUseCaseDiagram"
    // InternalUsecase.g:72:1: ruleUseCaseDiagram returns [EObject current=null] : ( () otherlv_1= '@start-ucd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-ucd' ) ;
    public final EObject ruleUseCaseDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_4=null;
        EObject lv_rootPackage_3_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:78:2: ( ( () otherlv_1= '@start-ucd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-ucd' ) )
            // InternalUsecase.g:79:2: ( () otherlv_1= '@start-ucd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-ucd' )
            {
            // InternalUsecase.g:79:2: ( () otherlv_1= '@start-ucd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-ucd' )
            // InternalUsecase.g:80:3: () otherlv_1= '@start-ucd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-ucd'
            {
            // InternalUsecase.g:80:3: ()
            // InternalUsecase.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUseCaseDiagramAccess().getUseCaseDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUseCaseDiagramAccess().getStartUcdKeyword_1());
            		
            // InternalUsecase.g:91:3: ( (lv_title_2_0= RULE_STRING ) )
            // InternalUsecase.g:92:4: (lv_title_2_0= RULE_STRING )
            {
            // InternalUsecase.g:92:4: (lv_title_2_0= RULE_STRING )
            // InternalUsecase.g:93:5: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_title_2_0, grammarAccess.getUseCaseDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseDiagramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUsecase.g:109:3: ( (lv_rootPackage_3_0= ruleRootPackage ) )
            // InternalUsecase.g:110:4: (lv_rootPackage_3_0= ruleRootPackage )
            {
            // InternalUsecase.g:110:4: (lv_rootPackage_3_0= ruleRootPackage )
            // InternalUsecase.g:111:5: lv_rootPackage_3_0= ruleRootPackage
            {

            					newCompositeNode(grammarAccess.getUseCaseDiagramAccess().getRootPackageRootPackageParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_rootPackage_3_0=ruleRootPackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUseCaseDiagramRule());
            					}
            					set(
            						current,
            						"rootPackage",
            						lv_rootPackage_3_0,
            						"de.cooperateproject.modeling.textual.usecase.Usecase.RootPackage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getUseCaseDiagramAccess().getEndUcdKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUseCaseDiagram"


    // $ANTLR start "entryRuleRootPackage"
    // InternalUsecase.g:136:1: entryRuleRootPackage returns [EObject current=null] : iv_ruleRootPackage= ruleRootPackage EOF ;
    public final EObject entryRuleRootPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootPackage = null;


        try {
            // InternalUsecase.g:136:52: (iv_ruleRootPackage= ruleRootPackage EOF )
            // InternalUsecase.g:137:2: iv_ruleRootPackage= ruleRootPackage EOF
            {
             newCompositeNode(grammarAccess.getRootPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRootPackage=ruleRootPackage();

            state._fsp--;

             current =iv_ruleRootPackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootPackage"


    // $ANTLR start "ruleRootPackage"
    // InternalUsecase.g:143:1: ruleRootPackage returns [EObject current=null] : (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_systems_3_0= ruleSystem ) )* ( (lv_relationships_4_0= ruleRelationship ) )* ) ;
    public final EObject ruleRootPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_actors_2_0 = null;

        EObject lv_systems_3_0 = null;

        EObject lv_relationships_4_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:149:2: ( (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_systems_3_0= ruleSystem ) )* ( (lv_relationships_4_0= ruleRelationship ) )* ) )
            // InternalUsecase.g:150:2: (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_systems_3_0= ruleSystem ) )* ( (lv_relationships_4_0= ruleRelationship ) )* )
            {
            // InternalUsecase.g:150:2: (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_systems_3_0= ruleSystem ) )* ( (lv_relationships_4_0= ruleRelationship ) )* )
            // InternalUsecase.g:151:3: otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_systems_3_0= ruleSystem ) )* ( (lv_relationships_4_0= ruleRelationship ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRootPackageAccess().getRootElementKeyword_0());
            		
            // InternalUsecase.g:155:3: ( (lv_name_1_0= ruleFQN ) )
            // InternalUsecase.g:156:4: (lv_name_1_0= ruleFQN )
            {
            // InternalUsecase.g:156:4: (lv_name_1_0= ruleFQN )
            // InternalUsecase.g:157:5: lv_name_1_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.cooperateproject.modeling.textual.usecase.Usecase.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUsecase.g:174:3: ( (lv_actors_2_0= ruleActor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||(LA1_0>=39 && LA1_0<=45)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUsecase.g:175:4: (lv_actors_2_0= ruleActor )
            	    {
            	    // InternalUsecase.g:175:4: (lv_actors_2_0= ruleActor )
            	    // InternalUsecase.g:176:5: lv_actors_2_0= ruleActor
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getActorsActorParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_actors_2_0=ruleActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actors",
            	    						lv_actors_2_0,
            	    						"de.cooperateproject.modeling.textual.usecase.Usecase.Actor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalUsecase.g:193:3: ( (lv_systems_3_0= ruleSystem ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUsecase.g:194:4: (lv_systems_3_0= ruleSystem )
            	    {
            	    // InternalUsecase.g:194:4: (lv_systems_3_0= ruleSystem )
            	    // InternalUsecase.g:195:5: lv_systems_3_0= ruleSystem
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getSystemsSystemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_systems_3_0=ruleSystem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"systems",
            	    						lv_systems_3_0,
            	    						"de.cooperateproject.modeling.textual.usecase.Usecase.System");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalUsecase.g:212:3: ( (lv_relationships_4_0= ruleRelationship ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25||(LA3_0>=31 && LA3_0<=33)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUsecase.g:213:4: (lv_relationships_4_0= ruleRelationship )
            	    {
            	    // InternalUsecase.g:213:4: (lv_relationships_4_0= ruleRelationship )
            	    // InternalUsecase.g:214:5: lv_relationships_4_0= ruleRelationship
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getRelationshipsRelationshipParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_relationships_4_0=ruleRelationship();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relationships",
            	    						lv_relationships_4_0,
            	    						"de.cooperateproject.modeling.textual.usecase.Usecase.Relationship");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootPackage"


    // $ANTLR start "entryRuleActor"
    // InternalUsecase.g:235:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalUsecase.g:235:46: (iv_ruleActor= ruleActor EOF )
            // InternalUsecase.g:236:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalUsecase.g:242:1: ruleActor returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'act' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) (otherlv_7= 'role' otherlv_8= '[' ( (lv_type_9_0= ruleActorType ) ) otherlv_10= ']' )? ( (lv_comments_11_0= ruleComment ) )? ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_alias_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_visibility_0_0 = null;

        Enumerator lv_type_9_0 = null;

        EObject lv_comments_11_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:248:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'act' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) (otherlv_7= 'role' otherlv_8= '[' ( (lv_type_9_0= ruleActorType ) ) otherlv_10= ']' )? ( (lv_comments_11_0= ruleComment ) )? ) )
            // InternalUsecase.g:249:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'act' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) (otherlv_7= 'role' otherlv_8= '[' ( (lv_type_9_0= ruleActorType ) ) otherlv_10= ']' )? ( (lv_comments_11_0= ruleComment ) )? )
            {
            // InternalUsecase.g:249:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'act' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) (otherlv_7= 'role' otherlv_8= '[' ( (lv_type_9_0= ruleActorType ) ) otherlv_10= ']' )? ( (lv_comments_11_0= ruleComment ) )? )
            // InternalUsecase.g:250:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'act' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) (otherlv_7= 'role' otherlv_8= '[' ( (lv_type_9_0= ruleActorType ) ) otherlv_10= ']' )? ( (lv_comments_11_0= ruleComment ) )?
            {
            // InternalUsecase.g:250:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=39 && LA4_0<=45)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUsecase.g:251:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalUsecase.g:251:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalUsecase.g:252:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getActorAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActorRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"de.cooperateproject.modeling.textual.usecase.Usecase.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUsecase.g:269:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUsecase.g:270:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalUsecase.g:270:4: (lv_abstract_1_0= 'abstract' )
                    // InternalUsecase.g:271:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,14,FOLLOW_11); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getActorAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActorRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getActorAccess().getActKeyword_2());
            		
            // InternalUsecase.g:287:3: ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUsecase.g:288:4: ( (lv_name_3_0= RULE_ID ) )
                    {
                    // InternalUsecase.g:288:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalUsecase.g:289:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalUsecase.g:289:5: (lv_name_3_0= RULE_ID )
                    // InternalUsecase.g:290:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUsecase.g:307:4: ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )
                    {
                    // InternalUsecase.g:307:4: ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )
                    // InternalUsecase.g:308:5: ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) )
                    {
                    // InternalUsecase.g:308:5: ( (lv_name_4_0= RULE_STRING ) )
                    // InternalUsecase.g:309:6: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalUsecase.g:309:6: (lv_name_4_0= RULE_STRING )
                    // InternalUsecase.g:310:7: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    							newLeafNode(lv_name_4_0, grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_3_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getActorAccess().getAsKeyword_3_1_1());
                    				
                    // InternalUsecase.g:330:5: ( (lv_alias_6_0= RULE_ID ) )
                    // InternalUsecase.g:331:6: (lv_alias_6_0= RULE_ID )
                    {
                    // InternalUsecase.g:331:6: (lv_alias_6_0= RULE_ID )
                    // InternalUsecase.g:332:7: lv_alias_6_0= RULE_ID
                    {
                    lv_alias_6_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    							newLeafNode(lv_alias_6_0, grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_3_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_6_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalUsecase.g:350:3: (otherlv_7= 'role' otherlv_8= '[' ( (lv_type_9_0= ruleActorType ) ) otherlv_10= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUsecase.g:351:4: otherlv_7= 'role' otherlv_8= '[' ( (lv_type_9_0= ruleActorType ) ) otherlv_10= ']'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getActorAccess().getRoleKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,18,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getActorAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalUsecase.g:359:4: ( (lv_type_9_0= ruleActorType ) )
                    // InternalUsecase.g:360:5: (lv_type_9_0= ruleActorType )
                    {
                    // InternalUsecase.g:360:5: (lv_type_9_0= ruleActorType )
                    // InternalUsecase.g:361:6: lv_type_9_0= ruleActorType
                    {

                    						newCompositeNode(grammarAccess.getActorAccess().getTypeActorTypeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_type_9_0=ruleActorType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActorRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_0,
                    							"de.cooperateproject.modeling.textual.usecase.Usecase.ActorType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getActorAccess().getRightSquareBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalUsecase.g:383:3: ( (lv_comments_11_0= ruleComment ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==35) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUsecase.g:384:4: (lv_comments_11_0= ruleComment )
                    {
                    // InternalUsecase.g:384:4: (lv_comments_11_0= ruleComment )
                    // InternalUsecase.g:385:5: lv_comments_11_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getActorAccess().getCommentsCommentParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comments_11_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActorRule());
                    					}
                    					add(
                    						current,
                    						"comments",
                    						lv_comments_11_0,
                    						"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleSystem"
    // InternalUsecase.g:406:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalUsecase.g:406:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalUsecase.g:407:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalUsecase.g:413:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'sys' ( (lv_name_1_0= ruleFQN ) ) ( ( (lv_comments_2_0= ruleComment ) )? | (otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* otherlv_6= '}' ) ) ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_comments_2_0 = null;

        EObject lv_comments_4_0 = null;

        EObject lv_usecases_5_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:419:2: ( (otherlv_0= 'sys' ( (lv_name_1_0= ruleFQN ) ) ( ( (lv_comments_2_0= ruleComment ) )? | (otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* otherlv_6= '}' ) ) ) )
            // InternalUsecase.g:420:2: (otherlv_0= 'sys' ( (lv_name_1_0= ruleFQN ) ) ( ( (lv_comments_2_0= ruleComment ) )? | (otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* otherlv_6= '}' ) ) )
            {
            // InternalUsecase.g:420:2: (otherlv_0= 'sys' ( (lv_name_1_0= ruleFQN ) ) ( ( (lv_comments_2_0= ruleComment ) )? | (otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* otherlv_6= '}' ) ) )
            // InternalUsecase.g:421:3: otherlv_0= 'sys' ( (lv_name_1_0= ruleFQN ) ) ( ( (lv_comments_2_0= ruleComment ) )? | (otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* otherlv_6= '}' ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSysKeyword_0());
            		
            // InternalUsecase.g:425:3: ( (lv_name_1_0= ruleFQN ) )
            // InternalUsecase.g:426:4: (lv_name_1_0= ruleFQN )
            {
            // InternalUsecase.g:426:4: (lv_name_1_0= ruleFQN )
            // InternalUsecase.g:427:5: lv_name_1_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getNameFQNParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.cooperateproject.modeling.textual.usecase.Usecase.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUsecase.g:444:3: ( ( (lv_comments_2_0= ruleComment ) )? | (otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* otherlv_6= '}' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==EOF||LA12_0==12||LA12_0==20||LA12_0==25||(LA12_0>=31 && LA12_0<=33)||LA12_0==35) ) {
                alt12=1;
            }
            else if ( (LA12_0==21) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalUsecase.g:445:4: ( (lv_comments_2_0= ruleComment ) )?
                    {
                    // InternalUsecase.g:445:4: ( (lv_comments_2_0= ruleComment ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==35) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalUsecase.g:446:5: (lv_comments_2_0= ruleComment )
                            {
                            // InternalUsecase.g:446:5: (lv_comments_2_0= ruleComment )
                            // InternalUsecase.g:447:6: lv_comments_2_0= ruleComment
                            {

                            						newCompositeNode(grammarAccess.getSystemAccess().getCommentsCommentParserRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_comments_2_0=ruleComment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSystemRule());
                            						}
                            						add(
                            							current,
                            							"comments",
                            							lv_comments_2_0,
                            							"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUsecase.g:465:4: (otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* otherlv_6= '}' )
                    {
                    // InternalUsecase.g:465:4: (otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* otherlv_6= '}' )
                    // InternalUsecase.g:466:5: otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_20); 

                    					newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2_1_0());
                    				
                    // InternalUsecase.g:470:5: ( (lv_comments_4_0= ruleComment ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==35) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalUsecase.g:471:6: (lv_comments_4_0= ruleComment )
                            {
                            // InternalUsecase.g:471:6: (lv_comments_4_0= ruleComment )
                            // InternalUsecase.g:472:7: lv_comments_4_0= ruleComment
                            {

                            							newCompositeNode(grammarAccess.getSystemAccess().getCommentsCommentParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_21);
                            lv_comments_4_0=ruleComment();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSystemRule());
                            							}
                            							add(
                            								current,
                            								"comments",
                            								lv_comments_4_0,
                            								"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalUsecase.g:489:5: ( (lv_usecases_5_0= ruleUseCase ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14||LA11_0==23||(LA11_0>=39 && LA11_0<=45)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalUsecase.g:490:6: (lv_usecases_5_0= ruleUseCase )
                    	    {
                    	    // InternalUsecase.g:490:6: (lv_usecases_5_0= ruleUseCase )
                    	    // InternalUsecase.g:491:7: lv_usecases_5_0= ruleUseCase
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getUsecasesUseCaseParserRuleCall_2_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_usecases_5_0=ruleUseCase();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"usecases",
                    	    								lv_usecases_5_0,
                    	    								"de.cooperateproject.modeling.textual.usecase.Usecase.UseCase");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_2_1_3());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleUseCase"
    // InternalUsecase.g:518:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // InternalUsecase.g:518:48: (iv_ruleUseCase= ruleUseCase EOF )
            // InternalUsecase.g:519:2: iv_ruleUseCase= ruleUseCase EOF
            {
             newCompositeNode(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // InternalUsecase.g:525:1: ruleUseCase returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'uc' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}' ) ) ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_alias_6_0=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_comments_7_0 = null;

        EObject lv_comments_9_0 = null;

        EObject lv_extensionPoints_10_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:531:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'uc' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}' ) ) ) )
            // InternalUsecase.g:532:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'uc' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}' ) ) )
            {
            // InternalUsecase.g:532:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'uc' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}' ) ) )
            // InternalUsecase.g:533:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'uc' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}' ) )
            {
            // InternalUsecase.g:533:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=39 && LA13_0<=45)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUsecase.g:534:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalUsecase.g:534:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalUsecase.g:535:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"de.cooperateproject.modeling.textual.usecase.Usecase.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUsecase.g:552:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUsecase.g:553:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalUsecase.g:553:4: (lv_abstract_1_0= 'abstract' )
                    // InternalUsecase.g:554:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,14,FOLLOW_23); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getUseCaseAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUseCaseRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getUcKeyword_2());
            		
            // InternalUsecase.g:570:3: ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_STRING) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalUsecase.g:571:4: ( (lv_name_3_0= RULE_ID ) )
                    {
                    // InternalUsecase.g:571:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalUsecase.g:572:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalUsecase.g:572:5: (lv_name_3_0= RULE_ID )
                    // InternalUsecase.g:573:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUseCaseRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUsecase.g:590:4: ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )
                    {
                    // InternalUsecase.g:590:4: ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )
                    // InternalUsecase.g:591:5: ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) )
                    {
                    // InternalUsecase.g:591:5: ( (lv_name_4_0= RULE_STRING ) )
                    // InternalUsecase.g:592:6: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalUsecase.g:592:6: (lv_name_4_0= RULE_STRING )
                    // InternalUsecase.g:593:7: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    							newLeafNode(lv_name_4_0, grammarAccess.getUseCaseAccess().getNameSTRINGTerminalRuleCall_3_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getUseCaseRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getUseCaseAccess().getAsKeyword_3_1_1());
                    				
                    // InternalUsecase.g:613:5: ( (lv_alias_6_0= RULE_ID ) )
                    // InternalUsecase.g:614:6: (lv_alias_6_0= RULE_ID )
                    {
                    // InternalUsecase.g:614:6: (lv_alias_6_0= RULE_ID )
                    // InternalUsecase.g:615:7: lv_alias_6_0= RULE_ID
                    {
                    lv_alias_6_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    							newLeafNode(lv_alias_6_0, grammarAccess.getUseCaseAccess().getAliasIDTerminalRuleCall_3_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getUseCaseRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_6_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalUsecase.g:633:3: ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==EOF||LA19_0==14||(LA19_0>=22 && LA19_0<=23)||LA19_0==35||(LA19_0>=39 && LA19_0<=45)) ) {
                alt19=1;
            }
            else if ( (LA19_0==21) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalUsecase.g:634:4: ( (lv_comments_7_0= ruleComment ) )?
                    {
                    // InternalUsecase.g:634:4: ( (lv_comments_7_0= ruleComment ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==35) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalUsecase.g:635:5: (lv_comments_7_0= ruleComment )
                            {
                            // InternalUsecase.g:635:5: (lv_comments_7_0= ruleComment )
                            // InternalUsecase.g:636:6: lv_comments_7_0= ruleComment
                            {

                            						newCompositeNode(grammarAccess.getUseCaseAccess().getCommentsCommentParserRuleCall_4_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_comments_7_0=ruleComment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getUseCaseRule());
                            						}
                            						add(
                            							current,
                            							"comments",
                            							lv_comments_7_0,
                            							"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUsecase.g:654:4: (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}' )
                    {
                    // InternalUsecase.g:654:4: (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}' )
                    // InternalUsecase.g:655:5: otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_24); 

                    					newLeafNode(otherlv_8, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalUsecase.g:659:5: ( (lv_comments_9_0= ruleComment ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==35) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalUsecase.g:660:6: (lv_comments_9_0= ruleComment )
                            {
                            // InternalUsecase.g:660:6: (lv_comments_9_0= ruleComment )
                            // InternalUsecase.g:661:7: lv_comments_9_0= ruleComment
                            {

                            							newCompositeNode(grammarAccess.getUseCaseAccess().getCommentsCommentParserRuleCall_4_1_1_0());
                            						
                            pushFollow(FOLLOW_25);
                            lv_comments_9_0=ruleComment();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getUseCaseRule());
                            							}
                            							add(
                            								current,
                            								"comments",
                            								lv_comments_9_0,
                            								"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalUsecase.g:678:5: ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==24) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalUsecase.g:679:6: (lv_extensionPoints_10_0= ruleExtensionPoint )
                    	    {
                    	    // InternalUsecase.g:679:6: (lv_extensionPoints_10_0= ruleExtensionPoint )
                    	    // InternalUsecase.g:680:7: lv_extensionPoints_10_0= ruleExtensionPoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseCaseAccess().getExtensionPointsExtensionPointParserRuleCall_4_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_extensionPoints_10_0=ruleExtensionPoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"extensionPoints",
                    	    								lv_extensionPoints_10_0,
                    	    								"de.cooperateproject.modeling.textual.usecase.Usecase.ExtensionPoint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_4_1_3());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleExtensionPoint"
    // InternalUsecase.g:707:1: entryRuleExtensionPoint returns [EObject current=null] : iv_ruleExtensionPoint= ruleExtensionPoint EOF ;
    public final EObject entryRuleExtensionPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionPoint = null;


        try {
            // InternalUsecase.g:707:55: (iv_ruleExtensionPoint= ruleExtensionPoint EOF )
            // InternalUsecase.g:708:2: iv_ruleExtensionPoint= ruleExtensionPoint EOF
            {
             newCompositeNode(grammarAccess.getExtensionPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtensionPoint=ruleExtensionPoint();

            state._fsp--;

             current =iv_ruleExtensionPoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtensionPoint"


    // $ANTLR start "ruleExtensionPoint"
    // InternalUsecase.g:714:1: ruleExtensionPoint returns [EObject current=null] : (otherlv_0= 'ep' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) ) ) ;
    public final EObject ruleExtensionPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;


        	enterRule();

        try {
            // InternalUsecase.g:720:2: ( (otherlv_0= 'ep' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) ) ) )
            // InternalUsecase.g:721:2: (otherlv_0= 'ep' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) ) )
            {
            // InternalUsecase.g:721:2: (otherlv_0= 'ep' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) ) )
            // InternalUsecase.g:722:3: otherlv_0= 'ep' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getExtensionPointAccess().getEpKeyword_0());
            		
            // InternalUsecase.g:726:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_STRING) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalUsecase.g:727:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalUsecase.g:727:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalUsecase.g:728:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUsecase.g:728:5: (lv_name_1_0= RULE_ID )
                    // InternalUsecase.g:729:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getExtensionPointAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtensionPointRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUsecase.g:746:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    {
                    // InternalUsecase.g:746:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    // InternalUsecase.g:747:5: ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    // InternalUsecase.g:747:5: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalUsecase.g:748:6: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalUsecase.g:748:6: (lv_name_2_0= RULE_STRING )
                    // InternalUsecase.g:749:7: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    							newLeafNode(lv_name_2_0, grammarAccess.getExtensionPointAccess().getNameSTRINGTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtensionPointRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_2_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getExtensionPointAccess().getAsKeyword_1_1_1());
                    				
                    // InternalUsecase.g:769:5: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalUsecase.g:770:6: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalUsecase.g:770:6: (lv_alias_4_0= RULE_ID )
                    // InternalUsecase.g:771:7: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(lv_alias_4_0, grammarAccess.getExtensionPointAccess().getAliasIDTerminalRuleCall_1_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtensionPointRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_4_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtensionPoint"


    // $ANTLR start "entryRuleRelationship"
    // InternalUsecase.g:793:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalUsecase.g:793:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalUsecase.g:794:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalUsecase.g:800:1: ruleRelationship returns [EObject current=null] : (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_Include_2= ruleInclude | this_Extend_3= ruleExtend ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_Association_0 = null;

        EObject this_Generalization_1 = null;

        EObject this_Include_2 = null;

        EObject this_Extend_3 = null;



        	enterRule();

        try {
            // InternalUsecase.g:806:2: ( (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_Include_2= ruleInclude | this_Extend_3= ruleExtend ) )
            // InternalUsecase.g:807:2: (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_Include_2= ruleInclude | this_Extend_3= ruleExtend )
            {
            // InternalUsecase.g:807:2: (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_Include_2= ruleInclude | this_Extend_3= ruleExtend )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt21=1;
                }
                break;
            case 31:
                {
                alt21=2;
                }
                break;
            case 32:
                {
                alt21=3;
                }
                break;
            case 33:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalUsecase.g:808:3: this_Association_0= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getAssociationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_0=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUsecase.g:817:3: this_Generalization_1= ruleGeneralization
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getGeneralizationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Generalization_1=ruleGeneralization();

                    state._fsp--;


                    			current = this_Generalization_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUsecase.g:826:3: this_Include_2= ruleInclude
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getIncludeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Include_2=ruleInclude();

                    state._fsp--;


                    			current = this_Include_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUsecase.g:835:3: this_Extend_3= ruleExtend
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getExtendParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Extend_3=ruleExtend();

                    state._fsp--;


                    			current = this_Extend_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleAssociation"
    // InternalUsecase.g:847:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalUsecase.g:847:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalUsecase.g:848:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalUsecase.g:854:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'iac' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' (otherlv_6= 'card' otherlv_7= '[' ( (lv_actorCardinality_8_0= ruleCardinality ) ) (otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) ) )? otherlv_11= ']' )? ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_actorCardinality_8_0 = null;

        EObject lv_useCaseCardinality_10_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:860:2: ( (otherlv_0= 'iac' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' (otherlv_6= 'card' otherlv_7= '[' ( (lv_actorCardinality_8_0= ruleCardinality ) ) (otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) ) )? otherlv_11= ']' )? ) )
            // InternalUsecase.g:861:2: (otherlv_0= 'iac' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' (otherlv_6= 'card' otherlv_7= '[' ( (lv_actorCardinality_8_0= ruleCardinality ) ) (otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) ) )? otherlv_11= ']' )? )
            {
            // InternalUsecase.g:861:2: (otherlv_0= 'iac' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' (otherlv_6= 'card' otherlv_7= '[' ( (lv_actorCardinality_8_0= ruleCardinality ) ) (otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) ) )? otherlv_11= ']' )? )
            // InternalUsecase.g:862:3: otherlv_0= 'iac' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' (otherlv_6= 'card' otherlv_7= '[' ( (lv_actorCardinality_8_0= ruleCardinality ) ) (otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) ) )? otherlv_11= ']' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getIacKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUsecase.g:870:3: ( ( ruleFQN ) )
            // InternalUsecase.g:871:4: ( ruleFQN )
            {
            // InternalUsecase.g:871:4: ( ruleFQN )
            // InternalUsecase.g:872:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationAccess().getActorActorCrossReference_2_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getCommaKeyword_3());
            		
            // InternalUsecase.g:890:3: ( ( ruleFQN ) )
            // InternalUsecase.g:891:4: ( ruleFQN )
            {
            // InternalUsecase.g:891:4: ( ruleFQN )
            // InternalUsecase.g:892:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationAccess().getUsecaseUseCaseCrossReference_4_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_29); 

            			newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getRightParenthesisKeyword_5());
            		
            // InternalUsecase.g:910:3: (otherlv_6= 'card' otherlv_7= '[' ( (lv_actorCardinality_8_0= ruleCardinality ) ) (otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) ) )? otherlv_11= ']' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUsecase.g:911:4: otherlv_6= 'card' otherlv_7= '[' ( (lv_actorCardinality_8_0= ruleCardinality ) ) (otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) ) )? otherlv_11= ']'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getCardKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_30); 

                    				newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_6_1());
                    			
                    // InternalUsecase.g:919:4: ( (lv_actorCardinality_8_0= ruleCardinality ) )
                    // InternalUsecase.g:920:5: (lv_actorCardinality_8_0= ruleCardinality )
                    {
                    // InternalUsecase.g:920:5: (lv_actorCardinality_8_0= ruleCardinality )
                    // InternalUsecase.g:921:6: lv_actorCardinality_8_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getAssociationAccess().getActorCardinalityCardinalityParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_actorCardinality_8_0=ruleCardinality();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssociationRule());
                    						}
                    						set(
                    							current,
                    							"actorCardinality",
                    							lv_actorCardinality_8_0,
                    							"de.cooperateproject.modeling.textual.usecase.Usecase.Cardinality");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUsecase.g:938:4: (otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==30) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalUsecase.g:939:5: otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) )
                            {
                            otherlv_9=(Token)match(input,30,FOLLOW_30); 

                            					newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getColonKeyword_6_3_0());
                            				
                            // InternalUsecase.g:943:5: ( (lv_useCaseCardinality_10_0= ruleCardinality ) )
                            // InternalUsecase.g:944:6: (lv_useCaseCardinality_10_0= ruleCardinality )
                            {
                            // InternalUsecase.g:944:6: (lv_useCaseCardinality_10_0= ruleCardinality )
                            // InternalUsecase.g:945:7: lv_useCaseCardinality_10_0= ruleCardinality
                            {

                            							newCompositeNode(grammarAccess.getAssociationAccess().getUseCaseCardinalityCardinalityParserRuleCall_6_3_1_0());
                            						
                            pushFollow(FOLLOW_17);
                            lv_useCaseCardinality_10_0=ruleCardinality();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationRule());
                            							}
                            							set(
                            								current,
                            								"useCaseCardinality",
                            								lv_useCaseCardinality_10_0,
                            								"de.cooperateproject.modeling.textual.usecase.Usecase.Cardinality");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_6_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleGeneralization"
    // InternalUsecase.g:972:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalUsecase.g:972:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalUsecase.g:973:2: iv_ruleGeneralization= ruleGeneralization EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralization=ruleGeneralization();

            state._fsp--;

             current =iv_ruleGeneralization; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // InternalUsecase.g:979:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUsecase.g:985:2: ( (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ) )
            // InternalUsecase.g:986:2: (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' )
            {
            // InternalUsecase.g:986:2: (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' )
            // InternalUsecase.g:987:3: otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getIsaKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUsecase.g:995:3: ( ( ruleFQN ) )
            // InternalUsecase.g:996:4: ( ruleFQN )
            {
            // InternalUsecase.g:996:4: ( ruleFQN )
            // InternalUsecase.g:997:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getSpecificBehavioredClassifierCrossReference_2_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneralizationAccess().getCommaKeyword_3());
            		
            // InternalUsecase.g:1015:3: ( ( ruleFQN ) )
            // InternalUsecase.g:1016:4: ( ruleFQN )
            {
            // InternalUsecase.g:1016:4: ( ruleFQN )
            // InternalUsecase.g:1017:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getGeneralBehavioredClassifierCrossReference_4_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGeneralizationAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleInclude"
    // InternalUsecase.g:1039:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalUsecase.g:1039:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalUsecase.g:1040:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalUsecase.g:1046:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'inc' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUsecase.g:1052:2: ( (otherlv_0= 'inc' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ) )
            // InternalUsecase.g:1053:2: (otherlv_0= 'inc' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' )
            {
            // InternalUsecase.g:1053:2: (otherlv_0= 'inc' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' )
            // InternalUsecase.g:1054:3: otherlv_0= 'inc' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getIncludeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUsecase.g:1062:3: ( ( ruleFQN ) )
            // InternalUsecase.g:1063:4: ( ruleFQN )
            {
            // InternalUsecase.g:1063:4: ( ruleFQN )
            // InternalUsecase.g:1064:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIncludeAccess().getIncludingCaseUseCaseCrossReference_2_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getCommaKeyword_3());
            		
            // InternalUsecase.g:1082:3: ( ( ruleFQN ) )
            // InternalUsecase.g:1083:4: ( ruleFQN )
            {
            // InternalUsecase.g:1083:4: ( ruleFQN )
            // InternalUsecase.g:1084:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIncludeAccess().getAdditionUseCaseCrossReference_4_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIncludeAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleExtend"
    // InternalUsecase.g:1106:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // InternalUsecase.g:1106:47: (iv_ruleExtend= ruleExtend EOF )
            // InternalUsecase.g:1107:2: iv_ruleExtend= ruleExtend EOF
            {
             newCompositeNode(grammarAccess.getExtendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtend=ruleExtend();

            state._fsp--;

             current =iv_ruleExtend; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtend"


    // $ANTLR start "ruleExtend"
    // InternalUsecase.g:1113:1: ruleExtend returns [EObject current=null] : (otherlv_0= 'ext' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' otherlv_6= 'ep' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' (otherlv_10= 'cond' otherlv_11= '[' ( (lv_condition_12_0= RULE_STRING ) ) otherlv_13= ']' )? ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_condition_12_0=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalUsecase.g:1119:2: ( (otherlv_0= 'ext' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' otherlv_6= 'ep' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' (otherlv_10= 'cond' otherlv_11= '[' ( (lv_condition_12_0= RULE_STRING ) ) otherlv_13= ']' )? ) )
            // InternalUsecase.g:1120:2: (otherlv_0= 'ext' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' otherlv_6= 'ep' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' (otherlv_10= 'cond' otherlv_11= '[' ( (lv_condition_12_0= RULE_STRING ) ) otherlv_13= ']' )? )
            {
            // InternalUsecase.g:1120:2: (otherlv_0= 'ext' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' otherlv_6= 'ep' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' (otherlv_10= 'cond' otherlv_11= '[' ( (lv_condition_12_0= RULE_STRING ) ) otherlv_13= ']' )? )
            // InternalUsecase.g:1121:3: otherlv_0= 'ext' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' otherlv_6= 'ep' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' (otherlv_10= 'cond' otherlv_11= '[' ( (lv_condition_12_0= RULE_STRING ) ) otherlv_13= ']' )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExtendAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUsecase.g:1129:3: ( ( ruleFQN ) )
            // InternalUsecase.g:1130:4: ( ruleFQN )
            {
            // InternalUsecase.g:1130:4: ( ruleFQN )
            // InternalUsecase.g:1131:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExtendAccess().getExtensionUseCaseCrossReference_2_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getExtendAccess().getCommaKeyword_3());
            		
            // InternalUsecase.g:1149:3: ( ( ruleFQN ) )
            // InternalUsecase.g:1150:4: ( ruleFQN )
            {
            // InternalUsecase.g:1150:4: ( ruleFQN )
            // InternalUsecase.g:1151:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExtendAccess().getExtendedCaseUseCaseCrossReference_4_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_32); 

            			newLeafNode(otherlv_5, grammarAccess.getExtendAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getExtendAccess().getEpKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getExtendAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalUsecase.g:1177:3: ( (otherlv_8= RULE_ID ) )
            // InternalUsecase.g:1178:4: (otherlv_8= RULE_ID )
            {
            // InternalUsecase.g:1178:4: (otherlv_8= RULE_ID )
            // InternalUsecase.g:1179:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_8, grammarAccess.getExtendAccess().getExtensionLocationExtensionPointCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_33); 

            			newLeafNode(otherlv_9, grammarAccess.getExtendAccess().getRightSquareBracketKeyword_9());
            		
            // InternalUsecase.g:1194:3: (otherlv_10= 'cond' otherlv_11= '[' ( (lv_condition_12_0= RULE_STRING ) ) otherlv_13= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUsecase.g:1195:4: otherlv_10= 'cond' otherlv_11= '[' ( (lv_condition_12_0= RULE_STRING ) ) otherlv_13= ']'
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getExtendAccess().getCondKeyword_10_0());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getExtendAccess().getLeftSquareBracketKeyword_10_1());
                    			
                    // InternalUsecase.g:1203:4: ( (lv_condition_12_0= RULE_STRING ) )
                    // InternalUsecase.g:1204:5: (lv_condition_12_0= RULE_STRING )
                    {
                    // InternalUsecase.g:1204:5: (lv_condition_12_0= RULE_STRING )
                    // InternalUsecase.g:1205:6: lv_condition_12_0= RULE_STRING
                    {
                    lv_condition_12_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_condition_12_0, grammarAccess.getExtendAccess().getConditionSTRINGTerminalRuleCall_10_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtendRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"condition",
                    							lv_condition_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getExtendAccess().getRightSquareBracketKeyword_10_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtend"


    // $ANTLR start "entryRuleComment"
    // InternalUsecase.g:1230:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalUsecase.g:1230:48: (iv_ruleComment= ruleComment EOF )
            // InternalUsecase.g:1231:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalUsecase.g:1237:1: ruleComment returns [EObject current=null] : (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:1243:2: ( (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) ) )
            // InternalUsecase.g:1244:2: (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) )
            {
            // InternalUsecase.g:1244:2: (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) )
            // InternalUsecase.g:1245:3: otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getNoteKeyword_0());
            		
            // InternalUsecase.g:1249:3: ( (lv_body_1_0= ruleCommentBody ) )
            // InternalUsecase.g:1250:4: (lv_body_1_0= ruleCommentBody )
            {
            // InternalUsecase.g:1250:4: (lv_body_1_0= ruleCommentBody )
            // InternalUsecase.g:1251:5: lv_body_1_0= ruleCommentBody
            {

            					newCompositeNode(grammarAccess.getCommentAccess().getBodyCommentBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleCommentBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommentRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"de.cooperateproject.modeling.textual.usecase.Usecase.CommentBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleCommentBody"
    // InternalUsecase.g:1272:1: entryRuleCommentBody returns [String current=null] : iv_ruleCommentBody= ruleCommentBody EOF ;
    public final String entryRuleCommentBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentBody = null;


        try {
            // InternalUsecase.g:1272:51: (iv_ruleCommentBody= ruleCommentBody EOF )
            // InternalUsecase.g:1273:2: iv_ruleCommentBody= ruleCommentBody EOF
            {
             newCompositeNode(grammarAccess.getCommentBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommentBody=ruleCommentBody();

            state._fsp--;

             current =iv_ruleCommentBody.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentBody"


    // $ANTLR start "ruleCommentBody"
    // InternalUsecase.g:1279:1: ruleCommentBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCommentBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalUsecase.g:1285:2: (this_STRING_0= RULE_STRING )
            // InternalUsecase.g:1286:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getCommentBodyAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommentBody"


    // $ANTLR start "entryRuleCardinality"
    // InternalUsecase.g:1296:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalUsecase.g:1296:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalUsecase.g:1297:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalUsecase.g:1303:1: ruleCardinality returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:1309:2: ( ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) )
            // InternalUsecase.g:1310:2: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            {
            // InternalUsecase.g:1310:2: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            // InternalUsecase.g:1311:3: ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            {
            // InternalUsecase.g:1311:3: ( (lv_lowerBound_0_0= ruleCardinalityBound ) )
            // InternalUsecase.g:1312:4: (lv_lowerBound_0_0= ruleCardinalityBound )
            {
            // InternalUsecase.g:1312:4: (lv_lowerBound_0_0= ruleCardinalityBound )
            // InternalUsecase.g:1313:5: lv_lowerBound_0_0= ruleCardinalityBound
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getLowerBoundCardinalityBoundParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_lowerBound_0_0=ruleCardinalityBound();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalityRule());
            					}
            					set(
            						current,
            						"lowerBound",
            						lv_lowerBound_0_0,
            						"de.cooperateproject.modeling.textual.usecase.Usecase.CardinalityBound");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUsecase.g:1330:3: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUsecase.g:1331:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0());
                    			
                    // InternalUsecase.g:1335:4: ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    // InternalUsecase.g:1336:5: (lv_upperBound_2_0= ruleCardinalityBound )
                    {
                    // InternalUsecase.g:1336:5: (lv_upperBound_2_0= ruleCardinalityBound )
                    // InternalUsecase.g:1337:6: lv_upperBound_2_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getCardinalityAccess().getUpperBoundCardinalityBoundParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_upperBound_2_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCardinalityRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_2_0,
                    							"de.cooperateproject.modeling.textual.usecase.Usecase.CardinalityBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleCardinalityBound"
    // InternalUsecase.g:1359:1: entryRuleCardinalityBound returns [String current=null] : iv_ruleCardinalityBound= ruleCardinalityBound EOF ;
    public final String entryRuleCardinalityBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinalityBound = null;


        try {
            // InternalUsecase.g:1359:56: (iv_ruleCardinalityBound= ruleCardinalityBound EOF )
            // InternalUsecase.g:1360:2: iv_ruleCardinalityBound= ruleCardinalityBound EOF
            {
             newCompositeNode(grammarAccess.getCardinalityBoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinalityBound=ruleCardinalityBound();

            state._fsp--;

             current =iv_ruleCardinalityBound.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinalityBound"


    // $ANTLR start "ruleCardinalityBound"
    // InternalUsecase.g:1366:1: ruleCardinalityBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCardinalityBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalUsecase.g:1372:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalUsecase.g:1373:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalUsecase.g:1373:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_INT) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalUsecase.g:1374:3: kw= '*'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUsecase.g:1380:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getCardinalityBoundAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinalityBound"


    // $ANTLR start "entryRuleFQN"
    // InternalUsecase.g:1391:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalUsecase.g:1391:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalUsecase.g:1392:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalUsecase.g:1398:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUsecase.g:1404:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUsecase.g:1405:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUsecase.g:1405:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUsecase.g:1406:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalUsecase.g:1413:3: (kw= '.' this_ID_2= RULE_ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==38) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalUsecase.g:1414:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,38,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "ruleVisibility"
    // InternalUsecase.g:1431:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalUsecase.g:1437:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) )
            // InternalUsecase.g:1438:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            {
            // InternalUsecase.g:1438:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            int alt28=7;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt28=1;
                }
                break;
            case 40:
                {
                alt28=2;
                }
                break;
            case 41:
                {
                alt28=3;
                }
                break;
            case 42:
                {
                alt28=4;
                }
                break;
            case 43:
                {
                alt28=5;
                }
                break;
            case 44:
                {
                alt28=6;
                }
                break;
            case 45:
                {
                alt28=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalUsecase.g:1439:3: (enumLiteral_0= '+' )
                    {
                    // InternalUsecase.g:1439:3: (enumLiteral_0= '+' )
                    // InternalUsecase.g:1440:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUsecase.g:1447:3: (enumLiteral_1= 'public' )
                    {
                    // InternalUsecase.g:1447:3: (enumLiteral_1= 'public' )
                    // InternalUsecase.g:1448:4: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUsecase.g:1455:3: (enumLiteral_2= '-' )
                    {
                    // InternalUsecase.g:1455:3: (enumLiteral_2= '-' )
                    // InternalUsecase.g:1456:4: enumLiteral_2= '-'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUsecase.g:1463:3: (enumLiteral_3= 'private' )
                    {
                    // InternalUsecase.g:1463:3: (enumLiteral_3= 'private' )
                    // InternalUsecase.g:1464:4: enumLiteral_3= 'private'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalUsecase.g:1471:3: (enumLiteral_4= '#' )
                    {
                    // InternalUsecase.g:1471:3: (enumLiteral_4= '#' )
                    // InternalUsecase.g:1472:4: enumLiteral_4= '#'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalUsecase.g:1479:3: (enumLiteral_5= 'protected' )
                    {
                    // InternalUsecase.g:1479:3: (enumLiteral_5= 'protected' )
                    // InternalUsecase.g:1480:4: enumLiteral_5= 'protected'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalUsecase.g:1487:3: (enumLiteral_6= '~' )
                    {
                    // InternalUsecase.g:1487:3: (enumLiteral_6= '~' )
                    // InternalUsecase.g:1488:4: enumLiteral_6= '~'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPackageEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getVisibilityAccess().getPackageEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "ruleActorType"
    // InternalUsecase.g:1498:1: ruleActorType returns [Enumerator current=null] : ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) ) ;
    public final Enumerator ruleActorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUsecase.g:1504:2: ( ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) ) )
            // InternalUsecase.g:1505:2: ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) )
            {
            // InternalUsecase.g:1505:2: ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            else if ( (LA29_0==47) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalUsecase.g:1506:3: (enumLiteral_0= 'human' )
                    {
                    // InternalUsecase.g:1506:3: (enumLiteral_0= 'human' )
                    // InternalUsecase.g:1507:4: enumLiteral_0= 'human'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUsecase.g:1514:3: (enumLiteral_1= 'machine' )
                    {
                    // InternalUsecase.g:1514:3: (enumLiteral_1= 'machine' )
                    // InternalUsecase.g:1515:4: enumLiteral_1= 'machine'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getActorTypeAccess().getMACHINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActorTypeAccess().getMACHINEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActorType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00003F838210C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000382100002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000382000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800200002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00003F8800C04000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00003F8000C04000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000801400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000002L});

}