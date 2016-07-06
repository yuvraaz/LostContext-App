package com.lostincontext.rules;

import java.util.List;

/**
 * Created by syrinetrabelsi on 05/07/2016.
 */

public class CompositeRuleDescription implements RuleDescription {
    private final List<RuleDescription> ruleDescriptions;
    private final Operator operator;

    public CompositeRuleDescription(List<RuleDescription> ruleDescriptions, Operator operator) {
        this.ruleDescriptions = ruleDescriptions;
        this.operator = operator;
    }

    @Override
    public Rule visit(RuleBuilder builder) {
        return builder.buildCompositeRule(this);
    }

    public enum Operator {
        AND,
        OR
    }

    public List<RuleDescription> getRuleDescriptions() {
        return ruleDescriptions;
    }


    public Operator getOperator() {
        return operator;
    }


}