function googleTranslateElementInit() {
    new google.translate.TranslateElement({
        pageLanguage: 'en',
        includedLanguages: 'en,th,fr,de,es,zh-CN', // List of languages you want to include
        layout: google.translate.TranslateElement.InlineLayout.SIMPLE,
        autoDisplay: false
    }, 'google_translate_element');
}

// Load the Google Translate script dynamically
const script = document.createElement("script");
script.type = "text/javascript";
script.src = "https://translate.google.com/translate_a/element.js?cb=googleTranslateElementInit";
document.head.appendChild(script);
