/* Data section */
	.section .data

	 .common num,4,4

L1:
	 .string "%d\n"


/* Text section */
	.section .text
	.global main
	.type main,@function
main:
	 pushq %rbp
	 movq %rsp,%rbp
	 pushq %rbx
	 pushq %r12
	 pushq %r13
	 pushq %r14
	 pushq %r15
	 subq $8,%rsp

	 movl $666, %r14d
	 movl %r14d,num(%rip)
	 movl num(%rip), %esi
	 movl $L1, %edi
	 call printf

	 addq $8,%rsp
	 popq %r15
	 popq %r14
	 popq %r13
	 popq %r12
	 popq %rbx
	 popq %rbp
	 ret
