package com.example.transactiontest1.test01;

import org.springframework.transaction.TransactionDefinition;

/**
 * @Description TO DO
 * @Classname TransactionDefinitionTest
 * @Date 2022/11/18 16:52
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
public class TransactionDefinitionTest {
    TransactionDefinition transactionDefinition = new TransactionDefinition() {
        @Override
        public int getPropagationBehavior() {
            return TransactionDefinition.super.getPropagationBehavior();
        }

        @Override
        public int getIsolationLevel() {
            return TransactionDefinition.super.getIsolationLevel();
        }

        @Override
        public int getTimeout() {
            return TransactionDefinition.super.getTimeout();
        }

        @Override
        public boolean isReadOnly() {
            return TransactionDefinition.super.isReadOnly();
        }

        @Override
        public String getName() {
            return TransactionDefinition.super.getName();
        }
    };

}
