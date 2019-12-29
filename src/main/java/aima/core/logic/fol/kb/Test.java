package aima.core.logic.fol.kb;

import java.util.ArrayList;
import java.util.List;

import aima.core.logic.fol.domain.DomainFactory;
import aima.core.logic.fol.domain.FOLDomain;
import aima.core.logic.fol.inference.FOLFCAsk;
import aima.core.logic.fol.inference.FOLBCAsk;
import aima.core.logic.fol.parsing.ast.Predicate;
import aima.core.logic.fol.parsing.ast.Variable;

public class Test<Term> {
	
	@org.junit.Test
	
	public void Test() {
		
	FOLKnowledgeBase fkb = new FOLKnowledgeBase(DomainFactory.studentDomain(), new FOLFCAsk());
	List<Term> terms = new ArrayList<Term>();
	terms.add((Term) new Variable("x"));
	terms.add((Term) new Variable ("y"));
	Predicate pFC = new Predicate("give course",(List<aima.core.logic.fol.parsing.ast.Term>) terms);
	fkb.ask(pFC);
	
	FOLKnowledgeBase fkb2 = new FOLKnowledgeBase(DomainFactory.studentDomain(), new FOLBCAsk());
	List<Term> terms2 = new ArrayList<Term>();
	terms2.add((Term) new Variable("x"));
	terms2.add((Term) new Variable ("y"));
	Predicate pBC = new Predicate("give course",(List<aima.core.logic.fol.parsing.ast.Term>) terms2);
	fkb.ask(pBC);
		
		
	}

}
