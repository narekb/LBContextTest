## Liquibase Context Test

#### Purpose

Test whether Liquibase Contexts are appropriate tools for conditionally populating databases with sample data.
Contexts will be configured through Spring profiles with two available options - _"dev"_ and _"prod"_.

Two samples will be made available, one will be populated only in the _"dev"_ context, the other one - regardless of context.