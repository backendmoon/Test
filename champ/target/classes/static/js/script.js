// Ajax로 데이터를 가져오는 함수
function fetchData() {
    // 가짜 API 주소 (JSONPlaceholder의 예제 사용)
    const apiUrl = 'https://jsonplaceholder.typicode.com/todos/1';

    // Ajax 요청
    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            // 데이터를 받아와서 처리하는 함수 호출
            handleData(data);
        })
        .catch(error => console.error('Error fetching data:', error));
}

// 데이터를 받아와서 화면을 변경하는 함수
function handleData(data) {
    // 동적으로 변경될 내용이 들어갈 컨테이너 선택
    const contentContainer = document.getElementById('content-container');

    // 내용을 생성하거나 업데이트
    const content = `
        <h2>${data.title}</h2>
        <p>${data.body}</p>
    `;

    // 컨테이너의 내용 갱신
    contentContainer.innerHTML = content;
}
