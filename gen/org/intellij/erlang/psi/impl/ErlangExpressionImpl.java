// This is a generated file. Not intended for manual editing.
package org.intellij.erlang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.erlang.ErlangTypes.*;
import org.intellij.erlang.psi.*;

public class ErlangExpressionImpl extends ErlangCompositeElementImpl implements ErlangExpression {

  public ErlangExpressionImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PsiElement getAtom() {
    return findChildByType(ERL_ATOM);
  }

  @Override
  @Nullable
  public PsiElement getCatch() {
    return findChildByType(ERL_CATCH);
  }

  @Override
  @Nullable
  public PsiElement getVar() {
    return findChildByType(ERL_VAR);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ErlangVisitor) ((ErlangVisitor)visitor).visitExpression(this);
    else super.accept(visitor);
  }

}
