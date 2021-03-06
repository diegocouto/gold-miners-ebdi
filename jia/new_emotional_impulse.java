package jia;

import jason.asSemantics.DefaultInternalAction;
import jason.asSemantics.TransitionSystem;
import jason.asSemantics.Unifier;
import jason.asSyntax.NumberTermImpl;
import jason.asSyntax.Term;
import lib.EmotionalAgent;

public class new_emotional_impulse extends DefaultInternalAction {

    @Override
    public Object execute(TransitionSystem ts, Unifier un, Term[] terms) throws Exception {
        try {
            EmotionalAgent agent = ((EmotionalAgent)ts.getAg());
            int impulse = (int)((NumberTermImpl)terms[0]).solve();

            agent.triggerImpulse(impulse);

            return true;
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        }
    }
}
