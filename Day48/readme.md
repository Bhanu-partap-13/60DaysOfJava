# Day [X]: Understanding Type Inference in Java

Today, I explored the concept of **Type Inference** in Java. Below are some beginner-friendly multiple-choice questions (MCQs) and code-based questions to help reinforce the topic.

---

## Beginner-Friendly Questions

### 1. What is type inference in Java?
- [x] The compiler's ability to determine the type of a variable automatically  
- [ ] Explicitly declaring the type of a variable  
- [ ] A feature to convert between primitive and wrapper types  
- [ ] A runtime type-checking mechanism  

### 2. Which operator is used for type inference with local variables in Java 10+?
- [ ] `=`  
- [x] `var`  
- [ ] `auto`  
- [ ] `infer`  

### 3. Can `var` be used to declare instance variables in a class?
- [ ] Yes  
- [x] No  

### 4. What is inferred when using `var` with this initialization?  
   ```java
   var list = new ArrayList<String>();
   ```
- [ ] Object 
- [x] ArrayList 
- [ ] ArrayList<String>
- [ ] Compilation Error

### 5. What happens when you try to initialize with var like this?
   ```java
   var obj = null;
   ```
- [ ] Runtime exception
- [ ] Infers Object type
- [ ] Infers Void type
- [x] Compilation Error

