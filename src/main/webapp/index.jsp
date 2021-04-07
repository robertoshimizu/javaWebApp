<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - HomePage</title>
    <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
</head>
<body>
<div class="min-h-screen bg-gray-100 py-6 flex flex-col justify-center sm:py-12">
    <div class="relative py-3 sm:max-w-xl sm:mx-auto">
        <div class="absolute inset-0 bg-gradient-to-r from-red-400 to-light-red-500 shadow-lg transform -skew-y-6 sm:skew-y-0 sm:-rotate-6 sm:rounded-3xl"></div>
        <div class="relative px-4 py-10 bg-white shadow-lg sm:rounded-3xl sm:p-20">
            <div class="max-w-md mx-auto">
                <div>
                    <img src="https://macmagazine.com.br/wp-content/uploads/2012/09/26-java-logo.jpg"
                         class="mx-auto transform scale-50"/>
                </div>
                <div class="divide-y divide-gray-200">
                    <div class="py-8 text-base leading-6 space-y-4 text-gray-700 sm:text-lg sm:leading-7">
                        <p>This is an introduction to Java Web Applications.</p>
                        <ul class="list-disc space-y-2">
                            <li class="flex items-start">
                <span class="h-6 flex items-center sm:h-7">
                  <svg class="flex-shrink-0 h-5 w-5 text-cyan-500" viewBox="0 0 20 20" fill="currentColor">
                    <path fill-rule="evenodd"
                          d="M10 18a8 8 0 100-16 8 8 0 000 16zm3.707-9.293a1 1 0 00-1.414-1.414L9 10.586 7.707 9.293a1 1 0 00-1.414 1.414l2 2a1 1 0 001.414 0l4-4z"
                          clip-rule="evenodd"/>
                  </svg>
                </span>
                                <p class="ml-2">
                                    Introduction to servlets and JSP pages
                                  <!--  <code class="text-sm font-bold text-gray-900">tailwind.config.js</code> file -->
                                </p>
                            </li>
                            <li class="flex items-start">
                <span class="h-6 flex items-center sm:h-7">
                  <svg class="flex-shrink-0 h-5 w-5 text-cyan-500" viewBox="0 0 20 20" fill="currentColor">
                    <path fill-rule="evenodd"
                          d="M10 18a8 8 0 100-16 8 8 0 000 16zm3.707-9.293a1 1 0 00-1.414-1.414L9 10.586 7.707 9.293a1 1 0 00-1.414 1.414l2 2a1 1 0 001.414 0l4-4z"
                          clip-rule="evenodd"/>
                  </svg>
                </span>
                                <p class="ml-2">
                                    Usage of tailwindcss to style pages
                                   <!-- <code class="text-sm font-bold text-gray-900">@apply</code>-->
                                </p>
                            </li>
                            <li class="flex items-start">
                <span class="h-6 flex items-center sm:h-7">
                  <svg class="flex-shrink-0 h-5 w-5 text-cyan-500" viewBox="0 0 20 20" fill="currentColor">
                    <path fill-rule="evenodd"
                          d="M10 18a8 8 0 100-16 8 8 0 000 16zm3.707-9.293a1 1 0 00-1.414-1.414L9 10.586 7.707 9.293a1 1 0 00-1.414 1.414l2 2a1 1 0 001.414 0l4-4z"
                          clip-rule="evenodd"/>
                  </svg>
                </span>
                                <p class="ml-2">Advanced Java language topics</p>
                            </li>
                        </ul>
                        <p>The intent is learning how the java EE stack works and creating a demo to
                            share online. The demo app is a network of consultants, a user can add its profile, edit, remove and list other members of the network. </p>
                    </div>
                    <div class="pt-6 text-base leading-6 font-bold sm:text-lg sm:leading-7">
                        <p>Want to access the demo application?</p>
                        <p>
                            <a href="MyServlet" class="text-cyan-600 hover:text-cyan-700"> ConsultantNet &rarr; </a>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>