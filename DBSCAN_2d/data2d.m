clear
a=xlsread('data2d.xlsx');
m=size(a,1);
for i=1:1:m
        plot(a(i,1),a(i,2),'b.');
    hold on;
end
grid on;
